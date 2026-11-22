# sansa-and-xor

[Original practice problem](https://www.hackerrank.com/challenges/sansa-and-xor/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

If array length is even, every element appears an even number of times in subarray XORs → result 0. If length is odd, only elements at even indices appear odd times, so answer is XOR of those. Time O(n) per test case, O(1) extra space.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
