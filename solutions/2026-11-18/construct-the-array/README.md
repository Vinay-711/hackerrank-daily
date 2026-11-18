# construct-the-array

[Original practice problem](https://www.hackerrank.com/challenges/construct-the-array/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Python 3**.

## Approach

We use dynamic programming. Let same[i] be the number of ways to construct an array of length i such that the last element is equal to 1, and diff[i] be the number of ways such that the last element is not equal to 1 (but can be x or any other). We can transition: same[i] = diff[i-1] * (k - 1) % MOD and diff[i] = (same[i-1] + diff[i-1] * (k - 2)) % MOD. If x == 1, we return same[n], otherwise diff[n]. Time complexity is O(N) and space complexity is O(1).

## Verification

Solution generated in Python 3 and verified Accepted on HackerRank by autonomous AI bot.
