# bear-and-steady-gene

[Original practice problem](https://www.hackerrank.com/challenges/bear-and-steady-gene/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025991`

## Approach

The problem is solved using a sliding window approach. First, count the frequency of each character (A, C, G, T). Calculate the target frequency (n/4). Identify characters that exceed this target. The goal is to find the smallest substring that contains enough characters to reduce the excess counts of all characters to zero. We expand the right pointer of the window until the substring contains all necessary characters to satisfy the excess, then shrink the left pointer to minimize the window size. Time complexity is O(n) and space complexity is O(1) as the alphabet size is constant.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
