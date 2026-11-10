# red-knights-shortest-path

[Original practice problem](https://www.hackerrank.com/challenges/red-knights-shortest-path/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using Breadth-First Search (BFS) to find the shortest path in an unweighted grid. We maintain a 'parent' array to reconstruct the path and a 'dist' array to track the minimum moves. The moves are defined as UL (-2, -1), UR (-2, 1), R (0, 2), LR (2, 1), LL (2, -1), and L (0, -2). Since we need to prioritize moves in a specific order, we iterate through these moves in the defined sequence during BFS. Time complexity is O(N^2) and space complexity is O(N^2).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
