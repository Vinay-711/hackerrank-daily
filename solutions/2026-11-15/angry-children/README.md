# angry-children

[Original practice problem](https://www.hackerrank.com/challenges/angry-children/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To minimize the unfairness (max - min) of a subset of size k, we first sort the array. Once sorted, any subset of size k that minimizes the difference between its maximum and minimum elements must consist of contiguous elements in the sorted array. We iterate through the sorted array with a sliding window of size k, calculating the difference between the element at index i and index i + k - 1. The minimum of these differences is the answer. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the input.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
