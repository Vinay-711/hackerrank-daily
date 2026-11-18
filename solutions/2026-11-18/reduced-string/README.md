# reduced-string

[Original practice problem](https://www.hackerrank.com/challenges/reduced-string/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

We use a StringBuilder as a stack to iterate through the string and efficiently remove adjacent duplicate characters. If the current character matches the top of the stack (the last character in the StringBuilder), we pop it; otherwise, we push the character. Time complexity is O(N) and space complexity is O(N) where N is the length of the string.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
