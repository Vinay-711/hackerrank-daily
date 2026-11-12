# bigger-is-greater

[Original practice problem](https://www.hackerrank.com/challenges/bigger-is-greater/problem)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487024083`

## Approach

The problem asks for the next lexicographical permutation of a string. This is solved using the standard algorithm: 1. Find the largest index i such that array[i] < array[i + 1]. 2. If no such index exists, the string is the last permutation. 3. Find the largest index j > i such that array[j] > array[i]. 4. Swap array[i] and array[j]. 5. Reverse the suffix starting at i + 1. Time complexity is O(N) per test case, space complexity is O(N) to store the character array.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
