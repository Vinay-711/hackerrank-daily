# crossword-puzzle

[Original practice problem](https://www.hackerrank.com/challenges/crossword-puzzle/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

Backtracking over all identified horizontal/vertical slots (length ≥ 2). For each slot we try every unused word of matching length that fits the current letters, place it, recurse, and backtrack if needed. With at most 10 words and a 10×10 board the search space is tiny. Time complexity is exponential in the number of words but bounded by a few thousand operations; space complexity is O(10×10) for the board plus O(number of slots) for recursion state.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
