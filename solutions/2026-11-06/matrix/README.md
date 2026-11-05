# matrix

[Original practice problem](https://www.hackerrank.com/challenges/matrix/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (Score: 60.0 / 60.0). Platform: **HackerRank**. Difficulty: **Hard**.

## Approach

Maximum Spanning Forest / Reverse Kruskal's algorithm using Disjoint Set Union (DSU) with rank and path compression. Roads are processed in descending order of destruction cost; a road is destroyed if and only if keeping it would connect two components that each already contain a machine. Achieves O(E log E + V alpha(V)) time complexity and O(V) space complexity.

## Verification

Compiled cleanly with `javac` and verified Accepted with full score on live HackerRank judge.
