# gridland-metro

[Original practice problem](https://www.hackerrank.com/challenges/gridland-metro/problem)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved by grouping tracks by row and merging overlapping intervals within each row. For each row, we sort the tracks by start column and merge them to calculate the total occupied cells. The total number of lampposts is (n * m) - (total occupied cells). Time complexity is O(K log K) due to sorting, and space complexity is O(K) to store the tracks.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
