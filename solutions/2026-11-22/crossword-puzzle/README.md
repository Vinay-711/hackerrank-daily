# crossword-puzzle

[Original practice problem](https://www.hackerrank.com/challenges/crossword-puzzle/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

Back‑track over all horizontal/vertical '-' slots (max ~20). For each slot try every unused word of matching length that fits the current letters, place it (saving previous chars), recurse, and undo on failure. Grid size is constant (10×10), so time is exponential in number of words but trivial for ≤10 words; worst‑case well under a millisecond. Space usage O(10×10) for the board plus O(number of slots) for slot list and recursion depth.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
