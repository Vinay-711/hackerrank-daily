# migratory-birds

[Original practice problem](https://www.hackerrank.com/challenges/migratory-birds/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

Since bird types are limited to 1-5, I use a frequency array of size 6 to count occurrences in O(n) time. I then iterate through the frequency array to find the index with the maximum count, ensuring the smallest ID is returned in case of ties. Space complexity is O(1) as the frequency array size is constant.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
