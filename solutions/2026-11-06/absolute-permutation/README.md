# absolute-permutation

[Original practice problem](https://www.hackerrank.com/challenges/absolute-permutation/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem requires finding a permutation where |p[i] - i| = k. If k = 0, the identity permutation is the only solution. If k > 0, the permutation must swap blocks of size k. Specifically, for every block of size 2k, the first k elements must be shifted by +k and the next k elements by -k. This is only possible if n is divisible by 2k. If n % (2k) != 0, no such permutation exists. Time complexity is O(n) per query, space complexity is O(n) to store the result.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
