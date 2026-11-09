# knightl-on-chessboard

[Original practice problem](https://www.hackerrank.com/challenges/knightl-on-chessboard/problem)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the shortest path of a knight with move (a, b) on an n x n board. Since the board is small (n <= 25), we can use Breadth-First Search (BFS) for each pair (a, b) where 1 <= a, b < n. The state space is n x n, and for each pair, BFS takes O(n^2) time. Total complexity is O(n^4), which is well within limits for n=25.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
