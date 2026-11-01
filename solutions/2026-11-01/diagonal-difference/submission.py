# AI-assisted archived practice solution
import os

def diagonalDifference(arr):
    n = len(arr)
    return abs(sum(arr[i][i] - arr[i][n-1-i] for i in range(n)))

if __name__ == "__main__":
    n = int(input().strip())
    arr = [list(map(int, input().split())) for _ in range(n)]
    result = diagonalDifference(arr)
    with open(os.environ["OUTPUT_PATH"], "w") as out:
        out.write(str(result) + "\n")
