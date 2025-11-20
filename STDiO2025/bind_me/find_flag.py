#!/usr/bin/env python3
import sys, re, urllib.parse as u

def multi_unquote_plus(s, rounds=6):
    # decode %XX and '+' to space repeatedly until stable (or max rounds)
    for _ in range(rounds):
        t = u.unquote_plus(s)
        if t == s: break
        s = t
    return s

# pattern for: ... ORD(MID((SELECT ... LIMIT 0,1), <idx>, 1))!=<N> ...
pat_neq = re.compile(
    r"ORD\s*\(\s*MID\s*\(\s*\(\s*SELECT.*?LIMIT\s+0,1\)\s*,\s*(\d+)\s*,\s*1\s*\)\s*\)\s*!=\s*(\d+)",
    re.IGNORECASE
)

# looser fallback (in case ORD(...) wrapper or spacing varies)
pat_neq_fallback = re.compile(
    r"(?:MID|SUBSTRING|SUBSTR)\s*\(\s*\(\s*SELECT.*?LIMIT\s+0,1\)\s*,\s*(\d+)\s*,\s*1\s*\)\s*!=\s*(\d+)",
    re.IGNORECASE
)

last_neq = {}   # idx -> final value seen
seen = 0

for raw in sys.stdin:
    line = multi_unquote_plus(raw.rstrip("\n"))
    m = pat_neq.search(line) or pat_neq_fallback.search(line)
    if m:
        idx = int(m.group(1))
        val = int(m.group(2))
        last_neq[idx] = val
        seen += 1

if not last_neq:
    print("(no characters recovered)\n[hint] Try piping a decoded stream:\n"
          "  python3 decode_stable.py < Compromised_access.log | python3 recover_flag_v2.py")
    sys.exit(0)

max_idx = max(last_neq.keys())
out = []
for i in range(1, max_idx+1):
    v = last_neq.get(i)
    out.append(chr(v) if v is not None and 32 <= v <= 126 else '?')

flag = ''.join(out).rstrip('?')

print(flag if flag else "(no characters recovered)")
print(f"[debug] neq-hits={seen}, distinct-positions={len(last_neq)}, max-index={max_idx}")
