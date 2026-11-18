# special-palindrome-again

[Original practice problem](https://www.hackerrank.com/challenges/special-palindrome-again/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

We scan the string once, grouping consecutive equal characters. For each group of length k we add k*(k+1)/2 to the answer – all substrings consisting of a single repeated character. Then we look at every group of length 1; if the characters on both sides are equal, we can form additional special substrings where this single character is the centre. The number added is the minimum size of the left and right equal groups. The algorithm runs in O(n) time and O(n) extra space (arrays of size n for group lengths and characters).

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
