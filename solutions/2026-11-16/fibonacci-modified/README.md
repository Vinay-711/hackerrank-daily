# fibonacci-modified

[Original practice problem](https://www.hackerrank.com/challenges/fibonacci-modified/problem)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

Since the sequence grows exponentially and exceeds the capacity of 64-bit integers, I used java.math.BigInteger to handle arbitrary-precision arithmetic. The algorithm iterates from 3 to n, updating the terms using the formula t_i = t_{i-2} + (t_{i-1})^2. Time complexity is O(n) and space complexity is O(1) as we only store the last two terms.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
