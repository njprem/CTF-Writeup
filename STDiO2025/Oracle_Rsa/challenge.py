#!/usr/local/bin/python3

import os
import sys
import textwrap
from Crypto.PublicKey import RSA

RSA_BITS = 1024
PROMPT = ">>> "
FLAG = os.environ.get("GZCTF_FLAG", "STDIO{this_is_fake_flag_do_not_submit}")

key = RSA.generate(RSA_BITS)
n, e, d = key.n, key.e, key.d


def hex_no_prefix(x: int) -> str:
    h = hex(x)
    return "-" + h[3:] if h.startswith("-0x") else h[2:]


def help() -> None:
    print(
        textwrap.dedent(
            """
        Commands:
          encrypt <text>        - encrypt UTF-8 text
          decrypt <hex>         - decrypt ciphertext
          info                  - reprint public parameters
          help                  - show this help
          exit / quit           - exit
    """
        ).strip()
    )


def info(flag_ciphertext: str) -> None:
    print("FLAG_CIPHERTEXT_HEX =", flag_ciphertext)
    print("N =", n)
    print("e =", e)


def encrypt(plaintext: str) -> str:
    m = int.from_bytes(plaintext.encode("utf-8"), "big")
    if m >= n:
        print("ERROR: plaintext integer >= N")
        return ""
    c = pow(m, e, n)
    c_hex = hex_no_prefix(c)
    return c_hex


def decrypt(ciphertext: str):
    c = int(ciphertext, 16)
    m = pow(c, d, n)
    plaintext_bytes = m.to_bytes((m.bit_length() + 7) // 8, "big")

    flag_bytes = FLAG.encode("utf-8")
    if plaintext_bytes == flag_bytes:
        return None, None

    try:
        plaintext = plaintext_bytes.decode("utf-8")
    except UnicodeDecodeError:
        plaintext = plaintext_bytes.hex()  # fallback to hex if not UTF-8

    return m, plaintext


def main() -> None:
    help()
    encrypted_flag = encrypt(FLAG)
    try:
        while True:
            line = input(PROMPT)
            if not line.strip():
                continue
            parts = line.strip().split(None, 1)
            cmd = parts[0].lower()
            arg = parts[1] if len(parts) > 1 else ""
            if cmd in ("exit", "quit"):
                break
            elif cmd == "help":
                help()
            elif cmd == "info":
                info(encrypted_flag)
            elif cmd == "encrypt":
                cipher_text = encrypt(arg)
                print("ciphertext (hex):", cipher_text)
            elif cmd == "decrypt":
                m, plaintext = decrypt(arg)
                if m is None:
                    print("Decryption refused: cannot decrypt the flag ciphertext.")
                    print("You think you can get it this way?")
                else:
                    print("Decrypted integer:", m)
                    print("Decrypted text:", plaintext)
            else:
                print("Unknown command. Type 'help' for usage.")
    except KeyboardInterrupt:
        print("\nInterrupted. Exiting.")


if __name__ == "__main__":
    main()
