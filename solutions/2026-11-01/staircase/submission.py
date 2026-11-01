# AI-assisted archived practice solution
def solve(data):
    n = int(data)
    return '\n'.join(' '*(n-i)+'#'*i for i in range(1,n+1))

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))
