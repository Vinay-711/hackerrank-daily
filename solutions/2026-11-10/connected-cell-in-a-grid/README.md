# connected-cell-in-a-grid

[Original practice problem](https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using Depth First Search (DFS) to traverse connected components in the grid. For each cell containing a 1, we initiate a DFS to count all connected 1s (including diagonals), marking visited cells as 0 to avoid redundant processing. The time complexity is O(N*M) as each cell is visited at most once, and space complexity is O(N*M) due to the recursion stack in the worst case.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
