#!/usr/bin/env python3
import sys

def theGreatXor(x: int) -> int:
    res = 0
    i = 0
    while x:
        if (x & 1) == 0:
            res += 1 << i
        x >>= 1
        i += 1
    return res

def main():
    data = sys.stdin.read().strip().split()
    if not data:
        return
    q = int(data[0])
    out_lines = []
    for idx in range(1, q + 1):
        x = int(data[idx])
        out_lines.append(str(theGreatXor(x)))
    sys.stdout.write('\n'.join(out_lines))

if __name__ == "__main__":
    main()