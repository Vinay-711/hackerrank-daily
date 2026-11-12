# queens-attack-2

[Original practice problem](https://www.hackerrank.com/challenges/queens-attack-2/problem)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487024000`

## Approach

The problem is solved by calculating the distance to the nearest obstacle in each of the 8 directions from the queen's position. If no obstacle exists in a direction, the distance is limited by the board boundaries. We initialize the distances for all 8 directions (up, down, left, right, and 4 diagonals) and iterate through the obstacles once to update these distances if an obstacle is closer than the current boundary. Time complexity is O(k) where k is the number of obstacles, and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
