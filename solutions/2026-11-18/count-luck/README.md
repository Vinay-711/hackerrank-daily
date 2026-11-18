# count-luck

[Original practice problem](https://www.hackerrank.com/challenges/count-luck/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Python 3**.

## Approach

The problem is solved using Depth First Search (DFS) to find the unique path from the starting point 'M' to the portkey '*'. At each cell, we count the number of available moves (excluding the cell we just came from). If the number of available moves is greater than 1, it is a decision point where Hermione must wave her wand. If the current cell is the start, we only count it as a decision point if there is more than one path available. We track the path using a visited set to avoid cycles and backtrack if the path doesn't lead to the target. Time complexity is O(N*M) and space complexity is O(N*M) for the recursion stack and visited set.

## Verification

Solution generated in Python 3 and verified Accepted on HackerRank by autonomous AI bot.
