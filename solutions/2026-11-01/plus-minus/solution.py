# AI-assisted archived practice solution
def solve(data):
    a = list(map(int, data.split()))
    n, values = a[0], a[1:]
    return '\n'.join(f'{count/n:.6f}' for count in (sum(x>0 for x in values), sum(x<0 for x in values), sum(x==0 for x in values)))

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))
