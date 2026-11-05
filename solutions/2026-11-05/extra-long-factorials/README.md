# extra-long-factorials

[Original practice problem](https://www.hackerrank.com/challenges/extra-long-factorials/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

We use Java's `java.math.BigInteger` to handle arbitrarily large integer values beyond the capacity of primitive data types like `long`. We compute the factorial iteratively by multiplying numbers from 2 to `n` into a `BigInteger` accumulator, and then print the result. The time complexity is O(n^2 log n) due to big integer multiplication, and space complexity is O(n log n) digits, which easily runs in negligible time and space for n <= 100.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
