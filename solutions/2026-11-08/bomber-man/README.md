# bomber-man

[Original practice problem](https://www.hackerrank.com/challenges/bomber-man/problem)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The grid state follows a periodic pattern after n=1. If n=1, return the initial grid. If n is even, the grid is full of bombs. If n is odd, the grid undergoes a detonation process. Specifically, for n > 1, the state repeats every 4 seconds. We calculate the state after the first detonation (n=3) and the second detonation (n=5). If n % 4 == 3, return the state after one detonation. If n % 4 == 1, return the state after two detonations. Time complexity is O(R*C) and space complexity is O(R*C).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
