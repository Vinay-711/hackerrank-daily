# almost-sorted

[Original practice problem](https://www.hackerrank.com/challenges/almost-sorted/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The algorithm identifies the range of elements that are out of order by comparing the input array with a sorted version. If the array is already sorted, it prints 'yes'. Otherwise, it finds the first and last indices where the array differs from the sorted version. It then checks if swapping these two elements results in a sorted array. If not, it checks if reversing the segment between these indices results in a sorted array. Time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
