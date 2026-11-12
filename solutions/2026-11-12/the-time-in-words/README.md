# the-time-in-words

[Original practice problem](https://www.hackerrank.com/challenges/the-time-in-words/problem)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487024170`

## Approach

The solution uses an array to map numbers 0-29 to their English word representations. It handles the three main cases: 'o' clock' for 0 minutes, 'past' for minutes <= 30, and 'to' for minutes > 30. Time complexity is O(1) as the number of operations is constant regardless of input. Space complexity is O(1) for the fixed-size word array.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
