# countingsort4

[Original practice problem](https://www.hackerrank.com/challenges/countingsort4/problem)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem requires a stable counting sort. We first determine the maximum integer value to size our buckets. We iterate through the input list, replacing the string with '-' if the index is in the first half. We then distribute the strings into buckets based on their integer value. Finally, we iterate through the buckets and print the strings in order. Time complexity is O(n + k) where n is the number of elements and k is the range of integers. Space complexity is O(n + k) to store the buckets.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
