# bigger-is-greater

[Original practice problem](https://www.hackerrank.com/challenges/bigger-is-greater/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the next lexicographical permutation of a string. This is a classic algorithm: 1. Find the largest index i such that w[i] < w[i+1]. 2. If no such index exists, the string is the largest permutation. 3. Find the largest index j such that w[j] > w[i]. 4. Swap w[i] and w[j]. 5. Reverse the suffix starting at i+1. Time complexity is O(N) per string, space complexity is O(N) to store the character array.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
