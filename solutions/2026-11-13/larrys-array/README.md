# larrys-array

[Original practice problem](https://www.hackerrank.com/challenges/larrys-array/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025729`

## Approach

The problem asks if a permutation can be sorted using 3-element rotations. A 3-element rotation is an even permutation (it preserves the parity of the number of inversions). Therefore, a permutation can be sorted if and only if it has an even number of inversions. The time complexity is O(n^2) to count inversions, and space complexity is O(1) beyond the input storage.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
