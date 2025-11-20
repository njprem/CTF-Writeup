// PLACEHOLDER_FLAG_START
const encryptedFlag = new Uint8Array([0xD1, 0x3D, 0x2E, 0x2A, 0xCD, 0x5B, 0x5A, 0x51, 0xB7, 0x36, 0x5B, 0x5B, 0xF9, 0x3B, 0x5A, 0x57, 0xE6, 0x36, 0x1E, 0x0C, 0xDD, 0x50, 0x29, 0x00, 0xB0, 0x06, 0x10, 0x24, 0xDD, 0x3E, 0x23, 0x37, 0xCA, 0x36, 0x5C, 0x0C, 0xCB, 0x0D, 0x2F, 0x0D, 0xDD, 0x3D, 0x5B, 0x00, 0xC9, 0x0C, 0x3E, 0x3C, 0xE3, 0x0C, 0x5E, 0x06, 0xBA, 0x0C, 0x5D, 0x02, 0xE0, 0x5A, 0x59, 0x05, 0xFF]);
// PLACEHOLDER_FLAG_END

// I'm so generous not putting these into wasm :D

function hashDjb2(str) {
    let hash = 5381;
    for (let i = 0; i < str.length; i++) {
        hash = ((hash << 5) + hash) + str.charCodeAt(i);
        hash = hash >>> 0;
    }
    return hash;
}

function xorCipher(data, key) {
    const keyBytes = [
        (key >> 24) & 0xFF,
        (key >> 16) & 0xFF,
        (key >> 8) & 0xFF,
        key & 0xFF
    ];

    const result = new Uint8Array(data.length);
    for (let i = 0; i < data.length; i++) {
        result[i] = data[i] ^ keyBytes[i % 4];
    }
    return result;
}

// Claude gives me the wrong code. It's not working yet >=(
// It should take values from wasm...
function decrypt_flag(key1, key2, key3) {
    const k1 = hashDjb2(key1);
    const k2 = hashDjb2(key2);
    const k3 = hashDjb2(key3);

    let temp1 = xorCipher(encryptedFlag, k1);
    let temp2 = xorCipher(temp1, k2);
    let decrypted = xorCipher(temp2, k3);

    return String.fromCharCode(...decrypted);
}

window.decrypt_flag = decrypt_flag;
