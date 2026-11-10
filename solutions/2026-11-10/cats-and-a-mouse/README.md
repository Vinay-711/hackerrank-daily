# cats-and-a-mouse

[Original practice problem](https://www.hackerrank.com/challenges/cats-and-a-mouse/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem requires calculating the absolute distance of each cat from the mouse. We use Math.abs() to find the distance for Cat A (|x - z|) and Cat B (|y - z|). Comparing these distances determines the winner: if distance A < distance B, Cat A wins; if distance B < distance A, Cat B wins; otherwise, it is a tie (Mouse C). Time complexity is O(1) per query, and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
