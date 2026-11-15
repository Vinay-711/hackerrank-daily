# flipping-the-matrix

[Original practice problem](https://www.hackerrank.com/challenges/flipping-the-matrix/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

For each cell (i, j) in the n x n upper-left quadrant, the possible values that can be moved to this position by flipping rows and columns are matrix[i][j], matrix[2n-1-i][j], matrix[i][2n-1-j], and matrix[2n-1-i][2n-1-j]. To maximize the sum, we pick the maximum of these four values for every cell in the quadrant. Time complexity is O(n^2) and space complexity is O(1) beyond the input storage.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
