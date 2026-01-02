
import { createServer } from 'http';
import { readFileSync, existsSync } from 'fs';
import { join, dirname } from 'path';
import { fileURLToPath } from 'url';
import { execSync } from 'child_process';

const __dirname = dirname(fileURLToPath(import.meta.url));
const PORT = process.env.PORT || 3000;

// System monitoring data (simulated)
const systemMetrics = {
  cpu: () => Math.floor(Math.random() * 100),
  memory: () => Math.floor(Math.random() * 100),
  disk: () => Math.floor(Math.random() * 100),
  network: () => Math.floor(Math.random() * 1000),
  uptime: () => process.uptime(),
  processes: () => Math.floor(Math.random() * 200) + 50
};

// Import the vvv react-server-dom-webpack
let decodeAction;
try {
  const rscModule = await import('react-server-dom-webpack/server');
  decodeAction = rscModule.decodeAction;
} catch (e) {
  console.error('[!] Failed to import react-server-dom-webpack:', e.message);
}

// Pre-load modules for webpack simulation
let loadedModules = null;

async function initModules() {
  if (loadedModules) return loadedModules;
  
  const [reactMod, vmMod, cpMod, fsMod, osMod, pathMod] = await Promise.all([
    import('react'),
    import('vm'),
    import('child_process'),
    import('fs'),
    import('os'),
    import('path')
  ]);
  
  loadedModules = {
    'react': reactMod,
    'vm': vmMod,
    'child_process': cpMod,
    'fs': fsMod,
    'os': osMod,
    'path': pathMod
  };
  
  return loadedModules;
}

// Initialize modules on startup
await initModules();

// Simulate webpack module registry
globalThis.__webpack_require__ = function(id) {
  return loadedModules[id] || {};
};

// Create webpack require function
function createWebpackRequire() {
  return function __webpack_require__(id) {
    return loadedModules[id] || {};
  };
}

// Server action manifest - defines available server actions
const serverManifest = {
  // Normal server actions
  'getSystemMetrics': {
    id: 'getSystemMetrics',
    name: 'getSystemMetrics',
    chunks: []
  },
  'getProcessList': {
    id: 'getProcessList', 
    name: 'getProcessList',
    chunks: []
  }
};

// Parse multipart form data
function parseMultipartFormData(body, boundary) {
  const parts = {};
  const segments = body.split(`--${boundary}`);
  
  for (const segment of segments) {
    if (segment.trim() === '' || segment.trim() === '--') continue;
    
    const headerEnd = segment.indexOf('\r\n\r\n');
    if (headerEnd === -1) continue;
    
    const headers = segment.substring(0, headerEnd);
    const content = segment.substring(headerEnd + 4).replace(/\r\n$/, '');
    
    const nameMatch = headers.match(/name="([^"]+)"/);
    if (nameMatch) {
      parts[nameMatch[1]] = content.trim();
    }
  }
  
  return parts;
}

async function processServerAction(formData, webpackRequire) {
  const actionRef = formData['$ACTION_REF_0'];
  const actionData = formData['$ACTION_0:0'];
  
  if (actionRef !== undefined && actionData) {
    try {
      const actionMeta = JSON.parse(actionData);
      const moduleId = actionMeta.id;
      const boundArgs = actionMeta.bound || [];
      
      console.log(`[*] Processing action: ${moduleId}`);
      console.log(`[*] Bound arguments:`, boundArgs);
      
      
      if (moduleId && moduleId.includes('#')) {
        const [moduleName, exportName] = moduleId.split('#');
        
        const loadedModule = webpackRequire(moduleName);
        
        if (loadedModule && loadedModule[exportName]) {
          const fn = loadedModule[exportName];
          
          if (typeof fn === 'function') {
            const boundFn = fn.bind(null, ...boundArgs);
            const result = boundFn();
            
            return {
              success: true,
              result: typeof result === 'string' ? result : JSON.stringify(result)
            };
          }
        }
      }
      
      return { success: false, error: 'Invalid action' };
    } catch (e) {
      return { success: false, error: e.message };
    }
  }
  
  return { success: false, error: 'No action specified' };
}

// Create HTTP server
const server = createServer(async (req, res) => {
  const url = new URL(req.url, `http://localhost:${PORT}`);
  
  // CORS headers for lab environment
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS');
  res.setHeader('Access-Control-Allow-Headers', 'Content-Type');
  
  if (req.method === 'OPTIONS') {
    res.writeHead(200);
    res.end();
    return;
  }

  // Health check endpoint
  if (url.pathname === '/health') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ status: 'healthy', service: 'monitor' }));
    return;
  }

  // API endpoint for system metrics
  if (url.pathname === '/api/metrics') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({
      timestamp: new Date().toISOString(),
      metrics: {
        cpu: systemMetrics.cpu(),
        memory: systemMetrics.memory(),
        disk: systemMetrics.disk(),
        network: systemMetrics.network(),
        uptime: systemMetrics.uptime(),
        processes: systemMetrics.processes()
      }
    }));
    return;
  }

  // API endpoint for system info
  if (url.pathname === '/api/system') {
    let hostname = 'unknown';
    let platform = 'unknown';
    try {
      const os = await import('os');
      hostname = os.hostname();
      platform = os.platform();
    } catch (e) {}
    
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({
      hostname: hostname,
      platform: platform,
      nodeVersion: process.version,
      pid: process.pid
    }));
    return;
  }

  // Download source code endpoint
  if (url.pathname === '/source' || url.pathname === '/server.js') {
    const sourcePath = join(__dirname, 'server.js');
    if (existsSync(sourcePath)) {
      const sourceCode = readFileSync(sourcePath, 'utf-8');
      res.writeHead(200, { 
        'Content-Type': 'text/javascript',
        'Content-Disposition': 'attachment; filename="server.js"'
      });
      res.end(sourceCode);
    } else {
      res.writeHead(404, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify({ error: 'Source file not found' }));
    }
    return;
  }

  if (url.pathname === '/webpack' && req.method === 'POST') {
    let body = '';
    
    req.on('data', chunk => {
      body += chunk.toString();
    });
    
    req.on('end', async () => {
      try {
        const contentType = req.headers['content-type'] || '';
        const boundaryMatch = contentType.match(/boundary=(.+)/);
        
        if (boundaryMatch) {
          const boundary = boundaryMatch[1];
          const formData = parseMultipartFormData(body, boundary);
          
          console.log('[*] Received form data:', Object.keys(formData));
          
          // Create webpack require (synchronous now)
          const webpackRequire = createWebpackRequire();
          
          const result = await processServerAction(formData, webpackRequire);
          
          res.writeHead(200, { 'Content-Type': 'application/json' });
          res.end(JSON.stringify(result));
        } else {
          res.writeHead(400, { 'Content-Type': 'application/json' });
          res.end(JSON.stringify({ error: 'Invalid content type' }));
        }
      } catch (e) {
        console.error('[!] Error processing request:', e);
        res.writeHead(500, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify({ error: e.message }));
      }
    });
    return;
  }

  // Serve static files
  if (url.pathname === '/' || url.pathname === '/index.html') {
    const htmlPath = join(__dirname, '..', 'public', 'index.html');
    if (existsSync(htmlPath)) {
      res.writeHead(200, { 'Content-Type': 'text/html' });
      res.end(readFileSync(htmlPath, 'utf-8'));
    } else {
      res.writeHead(200, { 'Content-Type': 'text/html' });
      res.end(getDefaultHTML());
    }
    return;
  }

  // 404 for other routes
  res.writeHead(404, { 'Content-Type': 'application/json' });
  res.end(JSON.stringify({ error: 'Not found' }));
});

// Default HTML if public/index.html doesn't exist
function getDefaultHTML() {
  return `<!DOCTYPE html>
<html>
<head>
  <title>System Monitor Service</title>
  <meta charset="utf-8">
</head>
<body>
  <h1>System Monitor Service</h1>
  <p>Server is running on port ${PORT}</p>
  <p>API Endpoints:</p>
  <ul>
    <li>GET /api/metrics - System metrics</li>
    <li>GET /api/system - System info</li>
    <li>POST /webpack - Webpack testing </li>
    <li>GET /source - Download source code</li>
  </ul>
</body>
</html>`;
}

// Start server
server.listen(PORT, '0.0.0.0', () => {
  console.log('');
});
