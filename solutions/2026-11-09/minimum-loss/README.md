# minimum-loss

[Original practice problem](https://www.hackerrank.com/challenges/minimum-loss/problem)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To minimize the loss, we need to find two prices such that the buy price is greater than the sell price, the buy year is earlier than the sell year, and the difference is minimized. By storing prices with their original indices and sorting them, we can compare adjacent elements in the sorted list. If a pair satisfies the condition (buy index < sell index), we calculate the difference and track the minimum. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the price-index pairs.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
