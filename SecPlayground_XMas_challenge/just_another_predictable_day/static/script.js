// TechCorp Portal - Client Side Scripts

document.addEventListener('DOMContentLoaded', function() {
    // Add smooth scrolling
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            const target = document.querySelector(this.getAttribute('href'));
            if (target) {
                target.scrollIntoView({
                    behavior: 'smooth'
                });
            }
        });
    });

    // Add animation to cards on hover
    const cards = document.querySelectorAll('.card, .feature-card, .vuln-card');
    cards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transition = 'all 0.3s ease';
        });
    });

    // Display current time for session debugging
    const debugInfo = document.querySelector('.debug-info');
    if (debugInfo) {
        const currentTimeElement = document.createElement('p');
        currentTimeElement.innerHTML = '<strong>Current Time (Unix):</strong> ' + Math.floor(Date.now() / 1000);
        debugInfo.appendChild(currentTimeElement);
    }

    // Copy flag to clipboard functionality
    const flagBox = document.querySelector('.flag-box code');
    if (flagBox) {
        flagBox.style.cursor = 'pointer';
        flagBox.title = 'Click to copy';
        
        flagBox.addEventListener('click', function() {
            const text = this.textContent;
            navigator.clipboard.writeText(text).then(function() {
                // Show success message
                const originalText = flagBox.textContent;
                flagBox.textContent = 'Copied to clipboard! ✓';
                flagBox.style.color = '#10b981';
                
                setTimeout(function() {
                    flagBox.textContent = originalText;
                    flagBox.style.color = '#ef4444';
                }, 2000);
            }).catch(function(err) {
                console.error('Failed to copy:', err);
            });
        });
    }

    // Add warning before downloading source
    const downloadButton = document.querySelector('a[href*="download-source"]');
    if (downloadButton && !window.location.pathname.includes('admin')) {
        downloadButton.addEventListener('click', function(e) {
            const proceed = confirm('You are about to download the application source code. This will help you understand how the session tokens are generated. Continue?');
            if (!proceed) {
                e.preventDefault();
            }
        });
    }

    // Highlight code blocks
    const codeBlocks = document.querySelectorAll('.code-block code');
    codeBlocks.forEach(block => {
        block.addEventListener('click', function() {
            const selection = window.getSelection();
            const range = document.createRange();
            range.selectNodeContents(this);
            selection.removeAllRanges();
            selection.addRange(range);
        });
    });

    // Add tooltip for session token cookie
    const sessionInfo = document.querySelector('.session-debug');
    if (sessionInfo) {
        const cookieInfo = document.createElement('div');
        cookieInfo.className = 'debug-info';
        cookieInfo.style.marginTop = '15px';
        
        // Get session cookie
        const cookies = document.cookie.split(';');
        let sessionToken = 'Not found';
        
        cookies.forEach(cookie => {
            const [name, value] = cookie.trim().split('=');
            if (name === 'session_token') {
                sessionToken = value;
            }
        });
        
        cookieInfo.innerHTML = '<p><strong>Your Session Token:</strong> <code style="background: rgba(0,0,0,0.1); padding: 2px 6px; border-radius: 4px;">' + sessionToken + '</code></p>';
        sessionInfo.appendChild(cookieInfo);
    }
});
