import random
from solution import diagonalDifference
assert diagonalDifference([[9]]) == 0
assert diagonalDifference([[1,2],[3,4]]) == 0
assert diagonalDifference([[0,0,5],[0,-8,0],[-2,0,0]]) == 3
rng = random.Random(711)
for n in range(1,31):
    a = [[rng.randint(-100,100) for _ in range(n)] for _ in range(n)]
    first = sum(a[i][j] for i in range(n) for j in range(n) if i == j)
    second = sum(a[i][j] for i in range(n) for j in range(n) if i+j == n-1)
    assert diagonalDifference(a) == abs(first-second)
print('33 cases passed')
