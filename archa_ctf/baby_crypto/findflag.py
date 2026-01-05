import base64
from itertools import product

ALPH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
NEEDLE = b"ARCHA{"

def read_tokens(path="bits.txt"):
    lines = []
    with open(path, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            lines.append(line.split())
    return lines

def pad5(tok: str) -> str:
    return tok.zfill(5)

def invbits(s: str) -> str:
    return "".join("1" if c == "0" else "0" for c in s)

def bits_variant(lines, swap_per_line=False, invert=False, revbits=False):
    out = []
    for parts in lines:
        p = parts[:]
        if swap_per_line and len(p) == 2:
            p = [p[1], p[0]]
        for tok in p:
            b = pad5(tok)
            if invert:
                b = invbits(b)
            if revbits:
                b = b[::-1]
            out.append(b)
    return "".join(out)

def bitstream_to_bytes(bitstream: str):
    out = bytearray()
    for i in range(0, len(bitstream) - 7, 8):
        out.append(int(bitstream[i:i+8], 2))
    return bytes(out)

def is_printable_flag(b: bytes):
    # must be exactly 39 bytes, printable ASCII, and end with }
    if len(b) != 39:
        return False
    if not (b.startswith(b"ARCHA{") and b.endswith(b"}")):
        return False
    return all(32 <= x <= 126 for x in b)

def try_repeating_xor_find_flag(ct: bytes, max_keylen=40):
    # We don’t assume where ARCHA{ is. We search for any keylen/offset that yields a valid 39-char flag.
    for keylen in range(1, max_keylen + 1):
        for off in range(0, len(ct) - 39 + 1):
            # derive repeating key bytes from known plaintext "ARCHA{"
            key = [None] * keylen
            ok = True
            for j, pb in enumerate(b"ARCHA{"):
                ki = (off + j) % keylen
                kb = ct[off + j] ^ pb
                if key[ki] is None:
                    key[ki] = kb
                elif key[ki] != kb:
                    ok = False
                    break
            if not ok:
                continue

            # Fill unknown key bytes by brute forcing ONLY the ones needed to validate 39-byte flag
            # We only need to decrypt 39 bytes starting at off.
            needed_positions = [(off + i) % keylen for i in range(39)]
            unknown_idxs = sorted({p for p in needed_positions if key[p] is None})

            # If too many unknowns, skip (rare)
            if len(unknown_idxs) > 4:
                continue

            # Brute unknown key bytes (0..255) for small count
            from itertools import product as prod
            for guess in prod(range(256), repeat=len(unknown_idxs)):
                key2 = key[:]
                for idx, val in zip(unknown_idxs, guess):
                    key2[idx] = val
                key_bytes = bytes(key2)

                flag = bytes(ct[off + i] ^ key_bytes[(off + i) % keylen] for i in range(39))
                if is_printable_flag(flag):
                    return keylen, off, key_bytes, flag
    return None

def main():
    lines = read_tokens("bits.txt")
    variants = list(product([False, True], [False, True], [False, True]))
    # (swap_per_line, invert, revbits)

    for swap, inv, rev in variants:
        bs = bits_variant(lines, swap_per_line=swap, invert=inv, revbits=rev)
        ct = bitstream_to_bytes(bs)

        res = try_repeating_xor_find_flag(ct, max_keylen=60)
        if res:
            keylen, off, key, flag = res
            print("[+] FOUND FLAG!")
            print(f"variant swap={swap} invert={inv} revbits={rev}")
            print(f"keylen={keylen} offset={off} key(hex)={key.hex()}")
            print(flag.decode("ascii"))
            return

    print("[-] No printable 39-char ARCHA{...} flag found with these variants + repeating XOR search.")

if __name__ == "__main__":
    main()
