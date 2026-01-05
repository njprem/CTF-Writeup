from itertools import product

NEEDLE = b"ARCHA{"
BITS_PER_TOKEN = 5

def read_tokens(path="bits.txt"):
    lines = []
    with open(path, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            parts = line.split()
            lines.append(parts)
    return lines  # list of [tok, tok, ...] per line (usually 2)

def pad5(tok: str) -> str:
    return tok.zfill(5)

def inv5(b5: str) -> str:
    # bitwise invert 5 bits
    return "".join("1" if c == "0" else "0" for c in b5)

def revbits(b5: str) -> str:
    return b5[::-1]

def tokens_to_bitstream(lines, swap_per_line=False, invert=False, reverse_bits=False):
    bits = []
    for parts in lines:
        parts2 = parts[:]
        if swap_per_line and len(parts2) == 2:
            parts2 = [parts2[1], parts2[0]]

        for tok in parts2:
            b = pad5(tok)
            if invert:
                b = inv5(b)
            if reverse_bits:
                b = revbits(b)
            bits.append(b)
    return "".join(bits)

def bitstream_to_bytes(bitstream: str):
    out = bytearray()
    for i in range(0, len(bitstream) - 7, 8):
        out.append(int(bitstream[i:i+8], 2))
    return bytes(out)

def score_printable(b: bytes):
    # quick heuristic
    printable = sum(32 <= x <= 126 or x in (10, 13, 9) for x in b)
    return printable / max(1, len(b))

def try_repeating_xor_crib(ct: bytes, needle=NEEDLE, max_keylen=32):
    hits = []
    n = len(needle)
    for keylen in range(1, max_keylen+1):
        for off in range(0, len(ct) - n + 1):
            key = [None] * keylen
            ok = True
            for j in range(n):
                ki = (off + j) % keylen
                kb = ct[off + j] ^ needle[j]
                if key[ki] is None:
                    key[ki] = kb
                elif key[ki] != kb:
                    ok = False
                    break
            if not ok:
                continue
            # fill unknown bytes with 0 just for a trial decrypt
            key_bytes = bytes((k if k is not None else 0) for k in key)
            pt = bytes(ct[i] ^ key_bytes[i % keylen] for i in range(len(ct)))
            if b"ARCHA{" in pt:
                hits.append((keylen, off, key_bytes, pt))
    return hits

def extract_flag(pt: bytes):
    s = pt.decode("utf-8", errors="ignore")
    i = s.find("ARCHA{")
    if i == -1:
        return None
    # grab until next }
    j = s.find("}", i)
    if j == -1:
        return None
    return s[i:j+1]

def main():
    lines = read_tokens("bits.txt")

    variants = list(product([False, True], [False, True], [False, True]))
    # (swap_per_line, invert, reverse_bits)
    best = []

    for swap, inv, rev in variants:
        bs = tokens_to_bitstream(lines, swap_per_line=swap, invert=inv, reverse_bits=rev)
        data = bitstream_to_bytes(bs)

        # quick checks
        sc = score_printable(data)
        best.append((sc, swap, inv, rev, data))

    best.sort(reverse=True, key=lambda x: x[0])

    print("[*] Top 3 variants by printable score:")
    for sc, swap, inv, rev, data in best[:3]:
        print(f"  score={sc:.2f} swap={swap} invert={inv} revbits={rev} len={len(data)} first16={data[:16].hex()}")

    # For each of the best few, try repeating-key XOR crib
    for sc, swap, inv, rev, data in best[:6]:
        hits = try_repeating_xor_crib(data, max_keylen=40)
        for keylen, off, key, pt in hits[:20]:
            flag = extract_flag(pt)
            if flag:
                print("\n[+] FLAG FOUND!")
                print(f"variant: swap={swap} invert={inv} revbits={rev}")
                print(f"keylen={keylen} offset={off} key(hex)={key.hex()}")
                print(flag)
                return

    print("\n[-] No flag found yet.")
    print("    Next step: paste the 'Top 3 variants' line output here, plus len/first16.")
    print("    Then we’ll target the right decode + second layer.")

if __name__ == "__main__":
    main()
