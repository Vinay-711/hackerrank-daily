# the-time-in-words

[Original practice problem](https://www.hackerrank.com/challenges/the-time-in-words/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The solution uses an array to store number-to-word mappings for 0-29. It handles the three main cases: m=0 (o' clock), m=15/30/45 (quarter/half), and general cases using 'past' or 'to'. Time complexity is O(1) as the number of operations is constant, and space complexity is O(1) for the lookup array.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
