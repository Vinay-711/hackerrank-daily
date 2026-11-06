# two-pluses

[Original practice problem](https://www.hackerrank.com/challenges/two-pluses/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The approach involves identifying all possible valid pluses in the grid. A plus is defined by its center (r, c) and its expansion size 's'. For each cell, we determine the maximum possible expansion size. We then store all valid pluses as a list of objects containing their center, size, and the set of occupied cells. Finally, we iterate through all pairs of pluses, check if they overlap using their occupied cell sets, and calculate the maximum product of their areas (area = 4*s + 1). Time complexity is O((N*M)^2) due to the nested iteration over possible pluses, which is efficient enough for the given constraints (N, M <= 15).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
