from flask import Flask, render_template, request, send_file, jsonify, send_from_directory
import os
import subprocess
import uuid
import magic
import zipfile
import io
from werkzeug.utils import secure_filename

app = Flask(__name__)
app.config['MAX_CONTENT_LENGTH'] = 5 * 1024 * 1024  # 5MB max file size
app.config['UPLOAD_FOLDER'] = '/app/uploads'
app.config['CONVERTED_FOLDER'] = '/app/converted'

ALLOWED_EXTENSIONS = {'png', 'jpg', 'jpeg', 'gif', 'bmp', 'svg', 'webp', 'tiff'}
OUTPUT_FORMATS = ['png', 'jpg', 'pdf', 'webp', 'bmp']

def allowed_file(filename):
    return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

def is_valid_image(filepath):
    """Validate uploaded file is actually an image"""
    try:
        mime = magic.Magic(mime=True)
        file_type = mime.from_file(filepath)
        # Allow image types and SVG
        return file_type.startswith('image/') or file_type == 'text/xml' or file_type == 'application/xml'
    except:
        return False

@app.route('/')
def index():
    return render_template('index.html', formats=OUTPUT_FORMATS)

@app.route('/upload', methods=['POST'])
def upload_file():
    if 'file' not in request.files:
        return jsonify({'error': 'No file provided'}), 400
    
    file = request.files['file']
    output_format = request.form.get('format', 'png')
    
    if file.filename == '':
        return jsonify({'error': 'No file selected'}), 400
    
    if not allowed_file(file.filename):
        return jsonify({'error': 'Invalid file type. Allowed: ' + ', '.join(ALLOWED_EXTENSIONS)}), 400
    
    if output_format not in OUTPUT_FORMATS:
        return jsonify({'error': 'Invalid output format'}), 400
    
    try:
        # Generate unique filename
        file_id = str(uuid.uuid4())
        original_ext = secure_filename(file.filename).rsplit('.', 1)[1].lower()
        input_path = os.path.join(app.config['UPLOAD_FOLDER'], f"{file_id}.{original_ext}")
        output_path = os.path.join(app.config['CONVERTED_FOLDER'], f"{file_id}.{output_format}")
        
        # Save uploaded file
        file.save(input_path)
        
        # Validate file type
        if not is_valid_image(input_path):
            os.remove(input_path)
            return jsonify({'error': 'Invalid image file'}), 400
        
        cmd = ['convert', input_path, output_path]
        result = subprocess.run(cmd, capture_output=True, text=True, timeout=10)
        
        if result.returncode != 0:
            os.remove(input_path)
            return jsonify({'error': 'Conversion failed', 'details': result.stderr}), 500
        
        # Clean up input file
        os.remove(input_path)
        
        return jsonify({
            'success': True,
            'file_id': file_id,
            'format': output_format,
            'download_url': f'/download/{file_id}.{output_format}'
        })
    
    except subprocess.TimeoutExpired:
        return jsonify({'error': 'Conversion timeout'}), 500
    except Exception as e:
        return jsonify({'error': str(e)}), 500

@app.route('/download/<filename>')
def download_file(filename):
    try:
        return send_from_directory(app.config['CONVERTED_FOLDER'], filename, as_attachment=True)
    except FileNotFoundError:
        return jsonify({'error': 'File not found'}), 404

@app.route('/source')
def download_source():
    """Provide source code for analysis"""
    try:
        memory_file = io.BytesIO()
        with zipfile.ZipFile(memory_file, 'w', zipfile.ZIP_DEFLATED) as zf:
            zf.write('/app/app.py', 'app.py')
            zf.write('/app/requirements.txt', 'requirements.txt')
            zf.write('/app/templates/index.html', 'templates/index.html')
            zf.write('/app/static/style.css', 'static/style.css')
            zf.write('/app/static/script.js', 'static/script.js')
        
        memory_file.seek(0)
        return send_file(
            memory_file,
            mimetype='application/zip',
            as_attachment=True,
            download_name='source_code.zip'
        )
    except Exception as e:
        return jsonify({'error': 'Failed to generate source code'}), 500

@app.route('/health')
def health():
    return jsonify({'status': 'healthy', 'service': 'Free Image Converter v1.0'})

if __name__ == '__main__':
    # Create directories if they don't exist
    os.makedirs(app.config['UPLOAD_FOLDER'], exist_ok=True)
    os.makedirs(app.config['CONVERTED_FOLDER'], exist_ok=True)
    
    app.run(host='0.0.0.0', port=5000, debug=False)
