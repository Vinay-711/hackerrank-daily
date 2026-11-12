# common-child

[Original practice problem](https://www.hackerrank.com/challenges/common-child/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025979`

## Approach

The problem is a classic Longest Common Subsequence (LCS) problem. Given the constraints (length up to 5000), a standard O(N^2) DP approach is required. To optimize space from O(N^2) to O(N), we use two rows (current and previous) to store DP states, as each cell only depends on the previous row and the current row's previous column. Time complexity is O(N^2) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
