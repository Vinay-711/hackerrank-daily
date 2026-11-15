# coin-change

[Original practice problem](https://www.hackerrank.com/challenges/coin-change/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using dynamic programming with a 1D array 'dp' of size n+1, where dp[i] stores the number of ways to make change for amount i. We iterate through each coin and update the dp array such that dp[j] = dp[j] + dp[j - coin]. This approach has a time complexity of O(n * m) and space complexity of O(n), where n is the target amount and m is the number of coin denominations.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
