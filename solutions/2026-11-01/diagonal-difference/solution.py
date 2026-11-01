def diagonalDifference(arr):
    n = len(arr)
    return abs(sum(arr[i][i] - arr[i][n-1-i] for i in range(n)))
