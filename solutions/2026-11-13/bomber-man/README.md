# bomber-man

[Original practice problem](https://www.hackerrank.com/challenges/bomber-man/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025899`

## Approach

The grid state follows a periodic pattern after n=1. If n is 1, return the initial grid. If n is even, the grid is full of bombs. If n % 4 == 3, the grid shows the result of the first detonation. If n % 4 == 1, the grid shows the result of the second detonation (the first detonation applied to the full grid). Time complexity is O(R*C) and space complexity is O(R*C).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
