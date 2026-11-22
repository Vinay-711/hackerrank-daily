# the-great-xor

[Original practice problem](https://www.hackerrank.com/challenges/the-great-xor/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Python 3**.

## Approach

For each zero‑bit in x at position i we get 2^i valid a values. Summing these gives the answer. The algorithm scans the bits of x once, so time O(log x) per query and O(1) extra space.

## Verification

Solution generated in Python 3 and verified Accepted on HackerRank by autonomous AI bot.
