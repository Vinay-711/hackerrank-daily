# hackerland-radio-transmitters

[Original practice problem](https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using a greedy approach. First, sort the house locations. Iterate through the sorted houses, identifying the leftmost uncovered house. Place a transmitter at the furthest possible house that can cover this leftmost house (within distance k). Then, skip all houses covered by this new transmitter (within distance k from the transmitter location) and repeat the process. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the input.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
