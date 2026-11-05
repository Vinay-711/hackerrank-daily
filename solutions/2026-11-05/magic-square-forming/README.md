# magic-square-forming

[Original practice problem](https://www.hackerrank.com/challenges/magic-square-forming/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

A 3x3 magic square containing distinct integers from 1 to 9 always has a magic constant of 15 with 5 at the center. There are only 8 possible 3x3 magic squares, which are rotations and reflections of the standard 3x3 magic square. We precompute all 8 valid magic squares, calculate the conversion cost for each against the given matrix, and return the minimum cost.

Time Complexity: O(1) because the size of the square is fixed at 3x3 and there are only 8 valid configurations.
Space Complexity: O(1) auxiliary space.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
