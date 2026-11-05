# the-grid-search

[Original practice problem](https://www.hackerrank.com/challenges/the-grid-search/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The approach iterates through the grid rows where the pattern could potentially start. For each row, it finds all occurrences of the first row of the pattern. If found, it checks if the subsequent rows of the pattern match the corresponding rows in the grid. The time complexity is O(R * C * r * c) in the worst case, where R, C are grid dimensions and r, c are pattern dimensions, which is efficient enough for the given constraints.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
