# bear-and-steady-gene

[Original practice problem](https://www.hackerrank.com/challenges/bear-and-steady-gene/problem)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using a sliding window (two-pointer) approach. First, we count the occurrences of each character ('A', 'C', 'G', 'T'). If a character count exceeds n/4, it must be part of the substring to be replaced. We define a 'needed' map for characters that exceed the threshold. The sliding window expands the right pointer until the substring contains enough of the 'needed' characters to satisfy the steady gene condition, then shrinks the left pointer to minimize the window size. Time complexity is O(n) and space complexity is O(1) as the alphabet size is constant.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
