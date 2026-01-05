from pathlib import Path

bear = "🐻‍❄️"
heart = "🖤"

s = Path("baby_crypto.txt").read_text(encoding="utf-8")

# convert to 0/1 while preserving spaces/newlines
s = s.replace(bear, "1").replace(heart, "0")
# remove any other characters except 0/1/space/newline
allowed = set("01 \n\r\t")
s = "".join(ch for ch in s if ch in allowed)

Path("bits.txt").write_text(s, encoding="utf-8")
print("Wrote bits.txt (0/1 with spaces preserved)")
