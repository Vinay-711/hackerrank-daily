# abbr

[Original practice problem](https://www.hackerrank.com/challenges/abbr/problem)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using dynamic programming. Let dp[i][j] be a boolean indicating if the prefix a[0...i-1] can be transformed into b[0...j-1]. If a[i-1] is uppercase, it must match b[j-1] (if j > 0) and the previous prefix must match. If a[i-1] is lowercase, it can either be deleted (dp[i-1][j]) or capitalized to match b[j-1] (dp[i-1][j-1]). Time complexity is O(N*M) and space complexity is O(N*M), where N and M are lengths of strings a and b.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
