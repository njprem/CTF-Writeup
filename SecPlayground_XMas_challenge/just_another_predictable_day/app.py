#!/usr/bin/env python3
import hashlib
import time
import os
from flask import Flask, request, render_template, redirect, url_for, make_response, send_file
from datetime import datetime
import zipfile
import io

app = Flask(__name__)

# Secret flag - only accessible by admin
FLAG = os.environ.get('FLAG', 'The flag is crypto{Sq3d98IIVV}')

# Simulated user database
USERS = {
    'john.doe': {
        'password': 'Password123!',
        'role': 'user',
        'full_name': 'John Doe',
        'department': 'Engineering',
        'email': 'john.doe@techcorp.local'
    },
    'jane.smith': {
        'password': 'SecurePass456',
        'role': 'user',
        'full_name': 'Jane Smith',
        'department': 'Marketing',
        'email': 'jane.smith@techcorp.local'
    },
    'admin': {
        'password': 'P@ssw0rd_Adm1n_2025!_Str0ng',
        'role': 'admin',
        'full_name': 'System Administrator',
        'department': 'IT Security',
        'email': 'admin@techcorp.local'
    }
}

# Session storage - In real app, this would be in database
SESSIONS = {}

def generate_session_token(username):
    """
    Generate session token using MD5(username + timestamp)
    WARNING: This is INSECURE and predictable!
    """
    # Get current timestamp (rounded to seconds)
    timestamp = str(int(time.time()))
    
    # Create token from username + timestamp
    token_string = f"{username}{timestamp}"
    session_token = hashlib.md5(token_string.encode()).hexdigest()
    
    # Store session with timestamp for demonstration
    SESSIONS[session_token] = {
        'username': username,
        'created_at': timestamp,
        'login_time': datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    }
    
    return session_token

def get_session(token):
    """Get session data from token"""
    return SESSIONS.get(token)

def is_admin(token):
    """Check if session belongs to admin"""
    session = get_session(token)
    if session:
        username = session.get('username')
        return USERS.get(username, {}).get('role') == 'admin'
    return False

@app.route('/')
def index():
    """Landing page"""
    session_token = request.cookies.get('session_token')
    
    if session_token and get_session(session_token):
        return redirect(url_for('dashboard'))
    
    return render_template('index.html')

@app.route('/login', methods=['GET', 'POST'])
def login():
    """Login page"""
    error = None
    
    if request.method == 'POST':
        username = request.form.get('username', '').strip()
        password = request.form.get('password', '')
        
        # Validate credentials
        if username in USERS and USERS[username]['password'] == password:
            # Generate session token
            session_token = generate_session_token(username)
            
            # Create response with cookie
            resp = make_response(redirect(url_for('dashboard')))
            resp.set_cookie('session_token', session_token, httponly=True)
            
            return resp
        else:
            error = 'Invalid username or password'
    
    return render_template('login.html', error=error)

@app.route('/dashboard')
def dashboard():
    """User dashboard"""
    session_token = request.cookies.get('session_token')
    
    if not session_token:
        return redirect(url_for('login'))
    
    session = get_session(session_token)
    if not session:
        resp = make_response(redirect(url_for('login')))
        resp.set_cookie('session_token', '', expires=0)
        return resp
    
    username = session.get('username')
    user_data = USERS.get(username, {})
    
    return render_template('dashboard.html', 
                         user=user_data, 
                         username=username,
                         session_info=session)

@app.route('/admin')
def admin():
    """Admin panel - contains the flag"""
    session_token = request.cookies.get('session_token')
    
    if not session_token:
        return redirect(url_for('login'))
    
    if not is_admin(session_token):
        return render_template('403.html'), 403
    
    session = get_session(session_token)
    username = session.get('username')
    user_data = USERS.get(username, {})
    
    # Admin panel with flag
    return render_template('admin.html', 
                         user=user_data,
                         username=username,
                         flag=FLAG,
                         total_users=len(USERS),
                         active_sessions=len(SESSIONS))

@app.route('/logout')
def logout():
    """Logout"""
    session_token = request.cookies.get('session_token')
    
    if session_token in SESSIONS:
        del SESSIONS[session_token]
    
    resp = make_response(redirect(url_for('index')))
    resp.set_cookie('session_token', '', expires=0)
    return resp

@app.route('/download-source')
def download_source():
    """Download source code for analysis"""
    # Create in-memory zip file
    memory_file = io.BytesIO()
    
    with zipfile.ZipFile(memory_file, 'w', zipfile.ZIP_DEFLATED) as zf:
        # Add app.py
        zf.writestr('app.py', open('app.py', 'r').read())
        
        # Add requirements.txt
        zf.writestr('requirements.txt', open('requirements.txt', 'r').read())
        
        # Add Dockerfile
        zf.writestr('Dockerfile', open('/app/Dockerfile', 'r').read() if os.path.exists('/app/Dockerfile') else '')
        
        # Add templates
        for template in ['index.html', 'login.html', 'dashboard.html', 'admin.html', '403.html']:
            template_path = f'templates/{template}'
            if os.path.exists(template_path):
                zf.writestr(f'templates/{template}', open(template_path, 'r').read())
        
        # Add static files
        for static_file in ['style.css', 'script.js']:
            static_path = f'static/{static_file}'
            if os.path.exists(static_path):
                zf.writestr(f'static/{static_file}', open(static_path, 'r').read())
    
    memory_file.seek(0)
    
    return send_file(
        memory_file,
        mimetype='application/zip',
        as_attachment=True,
        download_name='techcorp_portal_source.zip'
    )

@app.route('/hint')
def hint():
    """Hint page for players"""
    return render_template('hint.html')

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=False)
