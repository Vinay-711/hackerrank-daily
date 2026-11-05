# climbing-the-leaderboard

[Original practice problem](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To solve this problem efficiently, we first remove duplicate scores from the leaderboard (`ranked`) to form a strictly decreasing list of unique scores, which directly maps indices to dense ranks. Since the player's scores are given in non-decreasing order and the leaderboard scores are in non-increasing order, we can use a two-pointer technique. We start a pointer at the end of the unique leaderboard (lowest score / worst rank) and move leftwards as the player's score increases. This allows us to find each player's rank in $O(1)$ amortized time per game score.

Time Complexity: $O(n + m)$ where $n$ is the number of leaderboard scores and $m$ is the number of games played.
Space Complexity: $O(n)$ to store the deduplicated leaderboard.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
