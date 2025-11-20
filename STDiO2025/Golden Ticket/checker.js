const _0x3c4d = [0x62,0x71,0x76,0x6f,0x74,0x75,0x78,0x45,0x70,0x65,0x67];
const _0x9k2m = (a) => a.map(x => x ^ 0x3 ^ 0x2).map((y, i) => y - (i % 3));
const _0x7g8h = () => String.fromCharCode(..._0x9k2m(_0x3c4d));

function _0xa1b2(_0xp1) {
    const _0xp2 = _0xc3d4(_0xp1);
    try {
        const _0xp3 = new XMLHttpRequest();
        _0xp3.open('GET', _0xp2, false);
        _0xp3.send();
        if (_0xp3.status === 200) {
            const _0xp4 = JSON.parse(_0xp3.responseText);
            const _0xp5 = _0xp4[_0x7g8h()] || '';
            if (_0xp5) {
                return _0xe5f6(_0xp5);
            }
        }
    } catch (_0xe) {
    }
    return 0;
}

function _0xc3d4(ptr) {
    const memory = new Uint8Array(window.Module.HEAPU8.buffer);
    let str = '';
    let i = ptr;
    while (memory[i] !== 0) {
        str += String.fromCharCode(memory[i]);
        i++;
    }
    return str;
}

function _0xe5f6(str) {
    const memory = new Uint8Array(window.Module.HEAPU8.buffer);
    const ptr = window.Module._malloc(str.length + 1);
    for (let i = 0; i < str.length; i++) {
        memory[ptr + i] = str.charCodeAt(i);
    }
    memory[ptr + str.length] = 0;
    return ptr;
}

function initWasm() {
    return new Promise((resolve) => {
        window._0xg7h8 = _0xa1b2;
        window.Module = {
            instantiateWasm: function(imports, receiveInstance) {
                if (!imports.env) {
                    imports.env = {};
                }
                imports.env._0xg7h8 = _0xa1b2;
                imports.env.decrypt_flag = window.decrypt_flag;
                fetch('validator.wasm')
                    .then(response => response.arrayBuffer())
                    .then(bytes => WebAssembly.instantiate(bytes, imports))
                    .then(result => {
                        receiveInstance(result.instance, result.module);
                    })
                    .catch(err => {
                    });
                return {};
            },
            onRuntimeInitialized: function() {
                resolve(true);
            },
            onAbort: function(what) {
                resolve(false);
            }
        };
    });
}

async function validateSerial(serial) {
    if (!window.Module._validate_serial) {
        return null;
    }
    const serialPtr = _0xe5f6(serial);
    const flagPtr = window.Module._validate_serial(serialPtr);
    if (window.Module._free) {
        window.Module._free(serialPtr);
    }
    if (flagPtr === 0) {
        return null;
    }
    const flag = _0xc3d4(flagPtr);
    return flag;
}

window.initWasm = initWasm;
window.validateSerial = validateSerial;
