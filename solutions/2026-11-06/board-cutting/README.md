# board-cutting

[Original practice problem](https://www.hackerrank.com/challenges/board-cutting/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (Score: 60.0 / 60.0). Platform: **HackerRank**. Difficulty: **Hard**.

## Approach

Greedy board cutting strategy. Always prioritize cuts with the largest cost first to minimize multiplication by segment counts. Employs dual descending pointers with O((M + N) log(M + N)) time complexity and O(1) auxiliary space modulo 10^9 + 7.

## Verification

Compiled cleanly with `javac` and verified Accepted with full score on live HackerRank judge.
