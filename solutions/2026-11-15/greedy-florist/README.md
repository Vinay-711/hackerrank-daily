# greedy-florist

[Original practice problem](https://www.hackerrank.com/challenges/greedy-florist/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To minimize the total cost, we should purchase the most expensive flowers first to apply the smallest multipliers. We sort the array in descending order and distribute the flowers among the k friends in a round-robin fashion. The multiplier for each flower is determined by how many flowers that specific friend has already purchased. The time complexity is O(N log N) due to sorting, and space complexity is O(1) beyond the input storage.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
