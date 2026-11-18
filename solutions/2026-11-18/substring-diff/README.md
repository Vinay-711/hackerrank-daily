# substring-diff

[Original practice problem](https://www.hackerrank.com/challenges/substring-diff/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

To find the longest common substring with at most k mismatches, we can fix all possible relative alignments between s1 and s2. For each alignment, we iterate through characters and maintain a sliding window of mismatches. If the number of mismatches exceeds k, we advance the left pointer of the window until the mismatch count is within k. The maximum window length encountered gives the best answer for that alignment. Time complexity is O(N^2) where N is the length of strings, and space complexity is O(1) auxiliary.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
