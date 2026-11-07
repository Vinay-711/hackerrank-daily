# lilys-homework

[Original practice problem](https://www.hackerrank.com/challenges/lilys-homework/problem)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To minimize the sum of absolute differences, the array must be sorted in either ascending or descending order. The problem reduces to finding the minimum swaps to transform the original array into these sorted versions. This is equivalent to counting cycles in a permutation graph. For each target state, we map values to their target indices and traverse the cycles. The number of swaps for a cycle of length k is k-1. We calculate this for both ascending and descending targets and return the minimum. Time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
