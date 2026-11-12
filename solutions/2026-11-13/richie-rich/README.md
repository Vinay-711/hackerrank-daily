# richie-rich

[Original practice problem](https://www.hackerrank.com/challenges/richie-rich/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025955`

## Approach

The algorithm first identifies the minimum number of changes required to make the string a palindrome. If this minimum exceeds k, it returns -1. Otherwise, it greedily upgrades digits to '9' starting from the outside, using the remaining budget of changes. Time complexity is O(n) and space complexity is O(n) to store the character array.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
