raw = open("raw.bin","rb").read()
needle = b"ARCHA{"

def rotr(x,r): return ((x>>r) | ((x<<(8-r))&0xff)) & 0xff
def rotl(x,r): return (((x<<r)&0xff) | (x>>(8-r))) & 0xff

# 1) single-byte XOR
for k in range(256):
    x = bytes(b ^ k for b in raw)
    if needle in x:
        i = x.index(needle)
        print("FOUND xor", k, x[i:i+120])
        break

# 2) bit rotations
for r in range(1,8):
    x = bytes(rotl(b,r) for b in raw)
    if needle in x:
        i = x.index(needle)
        print("FOUND rotl", r, x[i:i+120])
        break
    x = bytes(rotr(b,r) for b in raw)
    if needle in x:
        i = x.index(needle)
        print("FOUND rotr", r, x[i:i+120])
        break
