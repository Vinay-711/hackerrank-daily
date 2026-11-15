# an-interesting-game-1

[Original practice problem](https://www.hackerrank.com/challenges/an-interesting-game-1/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The game is equivalent to counting how many times the maximum element changes as we traverse the array from left to right. Each time we encounter a new maximum, it represents a move that removes all elements to its right. Since Bob goes first, if the total number of moves is odd, Bob wins; if even, Andy wins. Time complexity is O(N) per game, space complexity is O(1) beyond input storage.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
