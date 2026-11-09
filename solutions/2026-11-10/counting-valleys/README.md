# counting-valleys

[Original practice problem](https://www.hackerrank.com/challenges/counting-valleys/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The algorithm tracks the current altitude relative to sea level. A valley is defined as a sequence of steps that goes below sea level and returns to sea level. We increment the valley count whenever we complete an upward step that brings the altitude from -1 to 0. Time complexity is O(n) where n is the number of steps, and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
