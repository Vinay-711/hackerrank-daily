# 3d-surface-area

[Original practice problem](https://www.hackerrank.com/challenges/3d-surface-area/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The surface area is calculated by summing the top and bottom faces (2 per non-zero cell) and the exposed side faces. For each cell, the side area is the difference in height between the current cell and its four neighbors (treating boundaries as height 0). Time complexity is O(H*W) and space complexity is O(1) beyond the input storage.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
