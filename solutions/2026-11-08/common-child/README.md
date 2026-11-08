# common-child

[Original practice problem](https://www.hackerrank.com/challenges/common-child/problem)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

This is a classic Longest Common Subsequence (LCS) problem. We use dynamic programming with a 2D array of size (n+1)x(n+1) to store the lengths of LCS for prefixes of s1 and s2. To optimize space, we only keep the current and previous rows, reducing space complexity from O(n^2) to O(n). Time complexity is O(n^2).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
