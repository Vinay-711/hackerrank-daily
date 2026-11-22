# the-great-xor

[Original practice problem](https://www.hackerrank.com/challenges/the-great-xor/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

The algorithm scans each bit of x up to its most‑significant 1. For every zero bit at position i we add 2^i to the answer. This runs in O(log x) time and O(1) extra space.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
