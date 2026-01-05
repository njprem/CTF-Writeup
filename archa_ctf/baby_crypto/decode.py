import base64
import re

ALPH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

tokens = []
with open("bits.txt", "r", encoding="utf-8") as f:
    for line in f:
        line = line.strip()
        if not line:
            continue
        parts = line.split()
        tokens.extend(parts)

# pad each token to 5 bits and convert to 0..31
vals = [int(t.zfill(5), 2) for t in tokens]

# convert to base32 string
s32 = "".join(ALPH[v] for v in vals)

# pad base32 to multiple of 8
s32 += "=" * ((-len(s32)) % 8)

raw = base64.b32decode(s32)

with open("raw.bin", "wb") as f:
    f.write(raw)

print("[+] wrote raw.bin", len(raw), "bytes")
