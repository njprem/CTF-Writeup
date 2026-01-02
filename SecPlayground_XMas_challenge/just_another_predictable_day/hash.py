import hashlib

username = "admin"
base_time = 1766811210 # เวลาอ้างอิงจากหน้าเว็บที่คุณเจอ

# วนลูปสร้าง token และพิมพ์ออกมาดู
for t in range(base_time - 60, base_time + 61):
    payload = f"{username}{t}"
    token = hashlib.md5(payload.encode()).hexdigest()
    print(token) 
