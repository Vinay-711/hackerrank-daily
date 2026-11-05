# organizing-containers-of-balls

[Original practice problem](https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks if we can sort balls into containers such that each container holds only one type of ball. Since swapping balls between containers preserves the total number of balls in each container and the total count of each ball type, the set of container capacities must match the set of total counts for each ball type. We calculate the sum of each row (container capacity) and the sum of each column (total count of each ball type), sort both arrays, and compare them. Time complexity is O(N^2) to sum the matrix and O(N log N) to sort, space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
