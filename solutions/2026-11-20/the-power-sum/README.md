# the-power-sum

[Original practice problem](https://www.hackerrank.com/challenges/the-power-sum/problem)

Date: 2026-11-20 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

DFS/backtracking over increasing bases up to floor(X^{1/N}). Each recursive call reduces the remaining sum; when it reaches 0 we count one way. Time complexity is O(number of explored combinations) – acceptable for the constraints. Space complexity is O(maxBase) recursion stack, i.e., O(X^{1/N}).

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
