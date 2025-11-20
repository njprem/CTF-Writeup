#!/usr/bin/env python
import socket
import marshal
import base64
import sys

"""
Flag is at /flag.txt
"""

PORT = int(sys.argv[1]) if len(sys.argv) > 1 else 9999
HOST = '0.0.0.0'

def handle_client(conn, addr):
    """Handle individual client connection"""
    try:
        conn.sendall(b"=" * 60 + b"\n")
        conn.sendall(b"  Welcome to the Marshal Execution Service\n")
        conn.sendall(b"=" * 60 + b"\n")
        conn.sendall(b"Send your base64-encoded marshaled Python code:\n")
        conn.sendall(b"(max 8192 bytes)\n")
        conn.sendall(b"\n")

        # Receive base64-encoded marshaled data
        data = conn.recv(8192).strip()

        # Decode base64
        marshaled_data = base64.b64decode(data)

        # Unmarshal the code object
        code_obj = marshal.loads(marshaled_data)

        # Execute the code
        exec(code_obj)

        conn.sendall(b"\nCode executed successfully!\n")

    except (OSError, socket.error) as e:
        error_type = type(e).__name__
        msg = "Error ({}): {}\n".format(error_type, str(e))
        try:
            conn.sendall(msg.encode())
        except:
            pass
    except:
        pass
    finally:
        # Always close the connection
        try:
            conn.shutdown(socket.SHUT_WR)
        except:
            pass
        try:
            conn.close()
        except:
            pass

def main():
    """Main server loop"""
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    s.bind((HOST, PORT))
    s.listen(5)
    print("[*] Listening on {}:{}".format(HOST, PORT))

    try:
        while True:
            conn, addr = s.accept()
            print("[+] Connection from {}".format(addr))
            handle_client(conn, addr)
            print("[-] Connection closed from {}".format(addr))
    finally:
        s.close()

if __name__ == "__main__":
    main()
