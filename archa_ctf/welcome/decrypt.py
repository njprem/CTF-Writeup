import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad

flag_b64 = "5/ZgWtrN9cS08FwZF2aaxhBXsf4+2PvWvHRWSvdvdYg="
ct = base64.b64decode(flag_b64)

key = "ม้า".encode("utf-8")
key32 = (key + b"\x00" * 32)[:32]   # pad with zeros to 32 bytes (AES-256)
iv = b"\x00" * 16                  # IV = 16 zero bytes

pt = AES.new(key32, AES.MODE_CBC, iv=iv).decrypt(ct)
pt = unpad(pt, 16)

print(pt.decode())
