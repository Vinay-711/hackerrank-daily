# queens-attack-2

[Original practice problem](https://www.hackerrank.com/challenges/queens-attack-2/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To solve Queen's Attack II in $O(k)$ time complexity, we calculate the maximum distance the queen can move in each of the 8 directions without any obstacles. Then, we iterate through the list of obstacles. For each obstacle, if it lies on one of the queen's 8 attack paths, we update the maximum step count in that direction to be the distance to that obstacle minus 1. Finally, we sum up the maximum steps possible in all 8 directions.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
