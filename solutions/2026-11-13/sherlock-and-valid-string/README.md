# sherlock-and-valid-string

[Original practice problem](https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025939`

## Approach

The approach counts character frequencies using a HashMap, then counts the occurrences of those frequencies. If there is only one frequency, the string is valid. If there are two frequencies, it checks if one frequency is 1 and appears only once, or if the difference between frequencies is 1 and the higher frequency appears only once. Time complexity is O(N) where N is the length of the string, and space complexity is O(1) since the alphabet size is constant.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
