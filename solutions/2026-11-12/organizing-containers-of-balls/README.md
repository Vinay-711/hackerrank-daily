# organizing-containers-of-balls

[Original practice problem](https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487024032`

## Approach

The problem asks if we can sort balls such that each container holds only one type of ball. Since swapping balls between containers does not change the total number of balls in a container or the total number of balls of a specific type, the set of container capacities must be equal to the set of total counts for each ball type. We calculate the sum of each row (container capacity) and the sum of each column (total balls of each type), sort both arrays, and compare them. Time complexity is O(N^2) to sum the matrix and O(N log N) to sort the arrays, where N is the number of containers.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
