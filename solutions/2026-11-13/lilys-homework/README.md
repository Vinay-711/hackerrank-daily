# lilys-homework

[Original practice problem](https://www.hackerrank.com/challenges/lilys-homework/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025927`

## Approach

To minimize the sum of absolute differences, the array must be sorted in either ascending or descending order. The problem reduces to finding the minimum number of swaps to transform an array into a target sorted state. This is equivalent to counting cycles in a permutation graph. We map each element to its target index using a HashMap and track visited elements to count cycles. The result is the minimum of swaps required for ascending and descending order. Time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
