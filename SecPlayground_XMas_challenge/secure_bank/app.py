#!/usr/bin/env python3
"""
SecureBank - Online Banking Portal
Version: 2.3.1
Copyright (c) 2024 SecureBank Corporation
"""

import os
import hashlib
import time
import sqlite3
from datetime import datetime, timedelta
from functools import wraps
from flask import Flask, render_template, request, redirect, url_for, session, flash, send_file, jsonify
import zipfile
import io

app = Flask(__name__)
app.secret_key = os.urandom(24)
app.config['SESSION_COOKIE_HTTPONLY'] = True
app.config['SESSION_COOKIE_SAMESITE'] = 'Lax'

DATABASE = '/tmp/securebank.db'
FLAG = os.environ.get('FLAG', 'FLAG{REDACTED}')

# Token expiry time (15 minutes)
TOKEN_EXPIRY_MINUTES = 15

def get_db():
    """Get database connection"""
    conn = sqlite3.connect(DATABASE)
    conn.row_factory = sqlite3.Row
    return conn

def init_db():
    """Initialize the database with tables and sample data"""
    conn = get_db()
    cursor = conn.cursor()
    
    # Create users table
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS users (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            email TEXT UNIQUE NOT NULL,
            password_hash TEXT NOT NULL,
            full_name TEXT NOT NULL,
            account_balance REAL DEFAULT 0.00,
            is_admin INTEGER DEFAULT 0,
            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
        )
    ''')
    
    # Create password_reset_tokens table
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS password_reset_tokens (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            user_id INTEGER NOT NULL,
            token TEXT NOT NULL,
            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
            used INTEGER DEFAULT 0,
            FOREIGN KEY (user_id) REFERENCES users(id)
        )
    ''')
    
    # Create transactions table
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS transactions (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            user_id INTEGER NOT NULL,
            type TEXT NOT NULL,
            amount REAL NOT NULL,
            description TEXT,
            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (user_id) REFERENCES users(id)
        )
    ''')
    
    # Create audit_log table
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS audit_log (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            action TEXT NOT NULL,
            details TEXT,
            ip_address TEXT,
            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
        )
    ''')
    
    # Insert sample users
    sample_users = [
        ('admin@securebank.local', hashlib.sha256('SuperSecretAdminPass2024!'.encode()).hexdigest(), 'System Administrator', 999999.99, 1),
        ('john.doe@securebank.local', hashlib.sha256('john123'.encode()).hexdigest(), 'John Doe', 15420.50, 0),
        ('jane.smith@securebank.local', hashlib.sha256('jane456'.encode()).hexdigest(), 'Jane Smith', 8750.25, 0),
        ('test@securebank.local', hashlib.sha256('test123'.encode()).hexdigest(), 'Test User', 100.00, 0),
    ]
    
    for email, pwd_hash, name, balance, is_admin in sample_users:
        try:
            cursor.execute(
                'INSERT INTO users (email, password_hash, full_name, account_balance, is_admin) VALUES (?, ?, ?, ?, ?)',
                (email, pwd_hash, name, balance, is_admin)
            )
        except sqlite3.IntegrityError:
            pass  # User already exists
    
    conn.commit()
    conn.close()

def generate_reset_token(email):
    """
    Generate a password reset token
    
    Security Note: Using timestamp-based token generation for 
    performance optimization. Token includes email hash for uniqueness.
    
    TODO: Consider upgrading to UUID-based tokens in v3.0
    """
    # Get current timestamp (rounded to second for consistency)
    timestamp = int(time.time())
    
    # Generate token using MD5 for quick hashing
    token_data = f"{email}{timestamp}"
    token = hashlib.md5(token_data.encode()).hexdigest()
    
    return token, timestamp

def verify_reset_token(token):
    """Verify if a reset token is valid and not expired"""
    conn = get_db()
    cursor = conn.cursor()
    
    cursor.execute('''
        SELECT prt.*, u.email 
        FROM password_reset_tokens prt
        JOIN users u ON prt.user_id = u.id
        WHERE prt.token = ? AND prt.used = 0
    ''', (token,))
    
    result = cursor.fetchone()
    conn.close()
    
    if not result:
        return None
    
    # Check if token is expired (15 minutes)
    created_at = datetime.strptime(result['created_at'], '%Y-%m-%d %H:%M:%S')
    if datetime.now() - created_at > timedelta(minutes=TOKEN_EXPIRY_MINUTES):
        return None
    
    return result

def login_required(f):
    """Decorator to require login for certain routes"""
    @wraps(f)
    def decorated_function(*args, **kwargs):
        if 'user_id' not in session:
            flash('Please login to access this page.', 'warning')
            return redirect(url_for('login'))
        return f(*args, **kwargs)
    return decorated_function

def log_action(action, details=None, ip_address=None):
    """Log an action to the audit log"""
    conn = get_db()
    cursor = conn.cursor()
    cursor.execute(
        'INSERT INTO audit_log (action, details, ip_address) VALUES (?, ?, ?)',
        (action, details, ip_address)
    )
    conn.commit()
    conn.close()

# ==================== Routes ====================

@app.route('/')
def index():
    """Home page - Landing page for SecureBank"""
    return render_template('index.html')

@app.route('/login', methods=['GET', 'POST'])
def login():
    """User login page"""
    if request.method == 'POST':
        email = request.form.get('email', '').strip().lower()
        password = request.form.get('password', '')
        
        conn = get_db()
        cursor = conn.cursor()
        
        password_hash = hashlib.sha256(password.encode()).hexdigest()
        cursor.execute(
            'SELECT * FROM users WHERE email = ? AND password_hash = ?',
            (email, password_hash)
        )
        user = cursor.fetchone()
        conn.close()
        
        if user:
            session['user_id'] = user['id']
            session['email'] = user['email']
            session['full_name'] = user['full_name']
            session['is_admin'] = user['is_admin']
            
            log_action('LOGIN_SUCCESS', f'User {email} logged in', request.remote_addr)
            flash('Welcome back!', 'success')
            return redirect(url_for('dashboard'))
        else:
            log_action('LOGIN_FAILED', f'Failed login attempt for {email}', request.remote_addr)
            flash('Invalid email or password.', 'danger')
    
    return render_template('login.html')

@app.route('/logout')
def logout():
    """User logout"""
    email = session.get('email', 'unknown')
    session.clear()
    log_action('LOGOUT', f'User {email} logged out', request.remote_addr)
    flash('You have been logged out.', 'info')
    return redirect(url_for('index'))

@app.route('/dashboard')
@login_required
def dashboard():
    """User dashboard - shows account info and transactions"""
    conn = get_db()
    cursor = conn.cursor()
    
    cursor.execute('SELECT * FROM users WHERE id = ?', (session['user_id'],))
    user = cursor.fetchone()
    
    cursor.execute(
        'SELECT * FROM transactions WHERE user_id = ? ORDER BY created_at DESC LIMIT 10',
        (session['user_id'],)
    )
    transactions = cursor.fetchall()
    conn.close()
    
    return render_template('dashboard.html', user=user, transactions=transactions, flag=FLAG if session.get('is_admin') else None)

@app.route('/forgot-password', methods=['GET', 'POST'])
def forgot_password():
    """Forgot password - Request password reset"""
    if request.method == 'POST':
        email = request.form.get('email', '').strip().lower()
        
        conn = get_db()
        cursor = conn.cursor()
        
        cursor.execute('SELECT * FROM users WHERE email = ?', (email,))
        user = cursor.fetchone()
        
        if user:
            # Generate reset token
            token, timestamp = generate_reset_token(email)
            
            # Store token in database
            cursor.execute(
                'INSERT INTO password_reset_tokens (user_id, token) VALUES (?, ?)',
                (user['id'], token)
            )
            conn.commit()
            
            log_action('PASSWORD_RESET_REQUESTED', f'Reset requested for {email} at timestamp {timestamp}', request.remote_addr)
            
            # In production, this would send an email
            # For this demo, we'll show a message
            flash(f'If an account exists with that email, a password reset link has been sent.', 'info')
        else:
            # Same message to prevent user enumeration
            flash(f'If an account exists with that email, a password reset link has been sent.', 'info')
            log_action('PASSWORD_RESET_REQUESTED', f'Reset requested for non-existent email {email}', request.remote_addr)
        
        conn.close()
        return redirect(url_for('forgot_password'))
    
    return render_template('forgot_password.html')

@app.route('/reset-password/<token>', methods=['GET', 'POST'])
def reset_password(token):
    """Reset password using token"""
    token_data = verify_reset_token(token)
    
    if not token_data:
        flash('Invalid or expired reset token.', 'danger')
        return redirect(url_for('forgot_password'))
    
    if request.method == 'POST':
        new_password = request.form.get('password', '')
        confirm_password = request.form.get('confirm_password', '')
        
        if len(new_password) < 6:
            flash('Password must be at least 6 characters.', 'danger')
            return render_template('reset_password.html', token=token)
        
        if new_password != confirm_password:
            flash('Passwords do not match.', 'danger')
            return render_template('reset_password.html', token=token)
        
        conn = get_db()
        cursor = conn.cursor()
        
        # Update password
        new_hash = hashlib.sha256(new_password.encode()).hexdigest()
        cursor.execute(
            'UPDATE users SET password_hash = ? WHERE id = ?',
            (new_hash, token_data['user_id'])
        )
        
        # Mark token as used
        cursor.execute(
            'UPDATE password_reset_tokens SET used = 1 WHERE token = ?',
            (token,)
        )
        
        conn.commit()
        conn.close()
        
        log_action('PASSWORD_RESET_SUCCESS', f'Password reset for user_id {token_data["user_id"]}', request.remote_addr)
        flash('Password has been reset successfully. Please login with your new password.', 'success')
        return redirect(url_for('login'))
    
    return render_template('reset_password.html', token=token)

@app.route('/source')
def source_code():
    """Download source code for security audit"""
    return render_template('source.html')

@app.route('/download/source')
def download_source():
    """Download source code as ZIP file"""
    # Create ZIP file in memory
    memory_file = io.BytesIO()
    
    with zipfile.ZipFile(memory_file, 'w', zipfile.ZIP_DEFLATED) as zf:
        # Read and add app.py (sanitized version)
        with open(__file__, 'r') as f:
            app_content = f.read()
            # Remove the actual flag from source
            sanitized_content = app_content.replace(FLAG, 'FLAG{REDACTED}')
            zf.writestr('app.py', sanitized_content)
        
        # Add templates
        templates_dir = os.path.join(os.path.dirname(__file__), 'templates')
        for template in os.listdir(templates_dir):
            with open(os.path.join(templates_dir, template), 'r') as f:
                zf.writestr(f'templates/{template}', f.read())
        
        # Add static files
        static_dir = os.path.join(os.path.dirname(__file__), 'static')
        if os.path.exists(static_dir):
            for static_file in os.listdir(static_dir):
                with open(os.path.join(static_dir, static_file), 'r') as f:
                    zf.writestr(f'static/{static_file}', f.read())
        
        # Add requirements.txt
        zf.writestr('requirements.txt', 'flask==3.0.0\n')
        
        # Add README
        readme_content = """# SecureBank Source Code

This is the source code for SecureBank's password reset functionality.

## Security Audit Notes

We believe our password reset implementation is secure, but we're 
providing this code for external security audit purposes.

## Running locally

```bash
pip install -r requirements.txt
python app.py
```

Access at http://localhost:5000
"""
        zf.writestr('README.md', readme_content)
    
    memory_file.seek(0)
    return send_file(
        memory_file,
        mimetype='application/zip',
        as_attachment=True,
        download_name='securebank-source.zip'
    )

@app.route('/api/server-time')
def server_time():
    """API endpoint to get server time (for debugging/sync)"""
    current_time = int(time.time())
    return jsonify({
        'timestamp': current_time,
        'datetime': datetime.now().strftime('%Y-%m-%d %H:%M:%S'),
        'timezone': 'UTC'
    })

@app.route('/health')
def health_check():
    """Health check endpoint"""
    return jsonify({'status': 'healthy', 'version': '2.3.1'})

# ==================== Error Handlers ====================

@app.errorhandler(404)
def not_found(e):
    return render_template('error.html', error='Page not found'), 404

@app.errorhandler(500)
def server_error(e):
    return render_template('error.html', error='Internal server error'), 500

# ==================== Main ====================

# Database initialization flag
_db_initialized = False

def ensure_db_initialized():
    """Ensure database is initialized (lazy initialization)"""
    global _db_initialized
    if not _db_initialized:
        init_db()
        _db_initialized = True

@app.before_request
def before_request():
    """Initialize database before first request"""
    ensure_db_initialized()

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=False)
