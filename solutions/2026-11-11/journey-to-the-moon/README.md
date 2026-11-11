# journey-to-the-moon

[Original practice problem](https://www.hackerrank.com/challenges/journey-to-the-moon/problem)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved by finding connected components in a graph where astronauts are nodes and shared nationalities are edges. Using Disjoint Set Union (DSU), we group astronauts into countries. We then calculate the size of each country. The total number of pairs is (n * (n - 1)) / 2, and we subtract the pairs formed by astronauts within the same country (size * (size - 1) / 2). Time complexity is O(n + p * alpha(n)), where alpha is the inverse Ackermann function, and space complexity is O(n).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
