# sam-and-substrings

[Original practice problem](https://www.hackerrank.com/challenges/sam-and-substrings/problem)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the sum of all substrings of a numeric string modulo 10^9 + 7. Let f(i) be the sum of all substrings ending at index i. Then f(i) = f(i-1) * 10 + (i + 1) * digit[i]. The total sum is the sum of f(i) for all i. This approach uses dynamic programming with O(n) time complexity and O(1) space complexity.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
