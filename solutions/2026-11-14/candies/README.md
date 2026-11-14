# candies

[Original practice problem](https://www.hackerrank.com/challenges/candies/problem)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using a two-pass greedy approach. First, we initialize an array of candies with 1 for each child. We perform a left-to-right pass to ensure that if a child has a higher rating than the previous one, they receive more candies than the previous child. Then, we perform a right-to-left pass to ensure that if a child has a higher rating than the next one, they receive more candies than the next child, while maintaining the constraints from the first pass using Math.max. The time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
