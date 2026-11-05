# floyd-city-of-blinding-lights

[Original practice problem](https://www.hackerrank.com/challenges/floyd-city-of-blinding-lights/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (Score: 60.0 / 60.0). Platform: **HackerRank**. Difficulty: **Hard**.

## Approach

All-pairs shortest paths using Floyd-Warshall algorithm with O(V^3) time complexity and O(V^2) space complexity. Accounts for problem requirement where latest edge overwrites previous edges and self-distance is 0.

## Verification

Compiled cleanly with `javac` and verified Accepted with full score on live HackerRank judge.
