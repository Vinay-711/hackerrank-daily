import sys

def countArray(n, k, x):
    MOD = 10**9 + 7
    
    same = 1
    diff = 0
    
    for i in range(2, n + 1):
        new_same = (diff * (k - 1)) % MOD
        new_diff = (same + diff * (k - 2)) % MOD
        same, diff = new_same, new_diff
        
    if x == 1:
        return same
    else:
        return diff

if __name__ == '__main__':
    input_data = sys.stdin.read().split()
    if input_data:
        n = int(input_data[0])
        k = int(input_data[1])
        x = int(input_data[2])

        answer = countArray(n, k, x)
        print(answer)