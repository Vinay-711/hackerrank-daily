# sherlock-and-cost

[Original practice problem](https://www.hackerrank.com/challenges/sherlock-and-cost/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To maximize the sum of absolute differences |A[i] - A[i-1]|, for each index i, we should choose A[i] to be either 1 or B[i]. This is a dynamic programming problem where we maintain two states: dpLow (max cost ending with A[i]=1) and dpHigh (max cost ending with A[i]=B[i]). For each step, we transition by calculating the max possible value based on the previous states. Time complexity is O(N) and space complexity is O(1) per test case.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
