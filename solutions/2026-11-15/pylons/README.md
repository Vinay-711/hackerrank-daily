# pylons

[Original practice problem](https://www.hackerrank.com/challenges/pylons/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using a greedy approach. We aim to cover the leftmost uncovered city by placing a power plant as far to the right as possible within its reach (range k-1). Specifically, if we need to cover city 'i', the furthest right we can place a plant is at index 'i + k - 1'. We search backwards from 'min(n-1, i + k - 1)' down to 'max(0, i - k + 1)' to find the first suitable city. If found, we increment the count and jump to the next uncovered city (which is the current plant index + k). If no such city exists, we return -1. Time complexity is O(n), space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
