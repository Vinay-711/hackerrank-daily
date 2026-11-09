# the-birthday-bar

[Original practice problem](https://www.hackerrank.com/challenges/the-birthday-bar/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the number of contiguous subarrays of length 'm' that sum to 'd'. I used a sliding window approach: first calculate the sum of the initial window of size 'm', then slide the window across the list by adding the next element and removing the leftmost element, checking the sum at each step. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
