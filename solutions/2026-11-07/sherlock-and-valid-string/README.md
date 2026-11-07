# sherlock-and-valid-string

[Original practice problem](https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The approach counts character frequencies using a HashMap. Then, it counts the frequencies of those frequencies. If there is only one unique frequency, or if there are two unique frequencies where one frequency is 1 and appears only once (or the frequency is one greater than the other and appears only once), the string is valid. Time complexity is O(N) where N is the length of the string, and space complexity is O(1) since the alphabet size is constant.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
