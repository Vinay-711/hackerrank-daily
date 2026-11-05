# non-divisible-subset

[Original practice problem](https://www.hackerrank.com/challenges/non-divisible-subset/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

We categorize the numbers in S based on their remainder when divided by k. If two numbers have remainders i and j such that (i + j) % k == 0, their sum is divisible by k. Therefore: 1) At most one number with remainder 0 can be included. 2) For each remainder pair (i, k - i), we cannot take numbers from both groups; to maximize the subset size, we take all numbers from the group with the higher frequency. 3) If k is even, at most one number with remainder k / 2 can be included. Time complexity is O(N + K) and space complexity is O(K).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
