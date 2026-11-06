# larrys-array

[Original practice problem](https://www.hackerrank.com/challenges/larrys-array/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks if an array can be sorted using 3-element rotations. A 3-element rotation is an even permutation (it preserves the parity of the number of inversions). Therefore, an array can be sorted if and only if the total number of inversions in the array is even. The time complexity is O(N^2) for counting inversions, which is efficient enough for the given constraints, and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
