import sys

def fairCut(n, k, arr):
    arr.sort()
    # dp[i][j] stores the minimum unfairness using first i elements with j elements in Li
    # However, since we need to minimize the sum of |Li_i - Lu_j|,
    # we can observe that the contribution of arr[i] is:
    # arr[i] * (count of Lu elements < arr[i] - count of Lu elements > arr[i])
    # + arr[i] * (count of Li elements > arr[i] - count of Li elements < arr[i])
    # This simplifies to calculating the contribution of each element based on its position.
    
    # Let x be the number of elements chosen for Li from the first i elements.
    # The number of elements in Lu from the first i is i - x.
    # The number of elements in Li from the remaining n-i-1 is k - x - 1.
    # The number of elements in Lu from the remaining n-i-1 is (n-k) - (i-x).
    
    # We use DP to find the optimal x for each i.
    dp = [float('inf')] * (k + 1)
    dp[0] = 0
    
    for i in range(n):
        new_dp = [float('inf')] * (k + 1)
        for j in range(k + 1):
            if dp[j] == float('inf'): continue
            
            # Option 1: Put arr[i] in Lu
            # Lu count so far: i - j
            # Li count so far: j
            cost_lu = arr[i] * ((j) - (k - j))
            if j <= k:
                new_dp[j] = min(new_dp[j], dp[j] + cost_lu)
            
            # Option 2: Put arr[i] in Li
            # Li count so far: j + 1
            # Lu count so far: i - j
            cost_li = arr[i] * ((i - j) - ((n - k) - (i - j)))
            if j + 1 <= k:
                new_dp[j + 1] = min(new_dp[j + 1], dp[j] + cost_li)
        dp = new_dp
    return dp[k]

if __name__ == '__main__':
    input_data = sys.stdin.read().split()
    if input_data:
        n = int(input_data[0])
        k = int(input_data[1])
        arr = [int(x) for x in input_data[2:]]
        print(fairCut(n, k, arr))