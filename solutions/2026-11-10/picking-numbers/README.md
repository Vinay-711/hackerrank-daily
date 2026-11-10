# picking-numbers

[Original practice problem](https://www.hackerrank.com/challenges/picking-numbers/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the longest subarray where the absolute difference between any two elements is at most 1. This means the subarray can only contain at most two distinct values, x and x+1. We can count the frequency of each number in the array using an array of size 101 (since constraints state elements are between 0 and 100). Then, we iterate through the frequency array and calculate the sum of frequencies of adjacent indices (i and i+1) to find the maximum possible length. Time complexity is O(n) to count frequencies and O(1) to find the max, space complexity is O(1) as the frequency array size is fixed.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
