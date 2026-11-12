# 3d-surface-area

[Original practice problem](https://www.hackerrank.com/challenges/3d-surface-area/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025639`

## Approach

The surface area is calculated by summing the top and bottom faces (2 * H * W) and then adding the exposed side faces. For each cell, the exposed side area is the difference in height between the current cell and its four neighbors (treating boundaries as height 0). Time complexity is O(H*W) and space complexity is O(H*W) to store the grid.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
