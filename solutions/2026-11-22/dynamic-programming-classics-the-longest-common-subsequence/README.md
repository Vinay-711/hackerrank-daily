# dynamic-programming-classics-the-longest-common-subsequence

[Original practice problem](https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

The DP fills an (n+1)*(m+1) table in O(n*m) time, then backtracks to build one LCS in O(n+m) time. Total time O(n*m), space O(n*m) for the table plus O(min(n,m)) for the output list.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
