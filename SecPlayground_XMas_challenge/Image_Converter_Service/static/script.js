document.addEventListener('DOMContentLoaded', function() {
    const uploadForm = document.getElementById('uploadForm');
    const fileInput = document.getElementById('fileInput');
    const uploadArea = document.getElementById('uploadArea');
    const resultDiv = document.getElementById('result');
    const loadingDiv = document.getElementById('loading');
    const uploadText = uploadArea.querySelector('.upload-text p');

    // Check service status
    fetch('/health')
        .then(response => response.json())
        .then(data => {
            document.getElementById('status').textContent = data.status === 'healthy' ? '✓ Online' : '✗ Offline';
            document.getElementById('status').style.color = data.status === 'healthy' ? '#4caf50' : '#f44336';
        })
        .catch(() => {
            document.getElementById('status').textContent = '✗ Offline';
            document.getElementById('status').style.color = '#f44336';
        });

    // Handle file selection display
    fileInput.addEventListener('change', function() {
        if (this.files && this.files[0]) {
            uploadText.textContent = `Selected: ${this.files[0].name}`;
            uploadArea.style.borderColor = '#4caf50';
        }
    });

    // Drag and drop handlers
    uploadArea.addEventListener('dragover', function(e) {
        e.preventDefault();
        this.style.background = '#e8f5e9';
        this.style.borderColor = '#4caf50';
    });

    uploadArea.addEventListener('dragleave', function() {
        this.style.background = '#f8f9ff';
        this.style.borderColor = '#667eea';
    });

    uploadArea.addEventListener('drop', function(e) {
        e.preventDefault();
        this.style.background = '#f8f9ff';
        this.style.borderColor = '#667eea';
        
        if (e.dataTransfer.files.length) {
            fileInput.files = e.dataTransfer.files;
            uploadText.textContent = `Selected: ${e.dataTransfer.files[0].name}`;
        }
    });

    // Handle form submission
    uploadForm.addEventListener('submit', async function(e) {
        e.preventDefault();
        
        resultDiv.innerHTML = '';
        resultDiv.className = 'result';
        loadingDiv.style.display = 'block';

        const formData = new FormData(this);

        try {
            const response = await fetch('/upload', {
                method: 'POST',
                body: formData
            });

            const data = await response.json();
            loadingDiv.style.display = 'none';

            if (data.success) {
                resultDiv.className = 'result success';
                resultDiv.innerHTML = `
                    <h3>✓ Conversion Successful!</h3>
                    <p>Your image has been converted to ${data.format.toUpperCase()}</p>
                    <a href="${data.download_url}" class="btn-primary" style="margin-top: 15px; display: inline-block; width: auto; padding: 12px 30px;">
                        Download Converted Image
                    </a>
                `;
            } else {
                throw new Error(data.error || 'Conversion failed');
            }
        } catch (error) {
            loadingDiv.style.display = 'none';
            resultDiv.className = 'result error';
            resultDiv.innerHTML = `
                <h3>✗ Error</h3>
                <p>${error.message}</p>
            `;
        }
    });
});
