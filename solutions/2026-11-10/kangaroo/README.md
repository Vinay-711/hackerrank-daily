# kangaroo

[Original practice problem](https://www.hackerrank.com/challenges/kangaroo/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks if there exists a non-negative integer n such that x1 + n*v1 = x2 + n*v2. Rearranging gives n*(v1 - v2) = x2 - x1. For a solution to exist, (x2 - x1) must be divisible by (v1 - v2), and the resulting n must be non-negative. Time complexity is O(1) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
