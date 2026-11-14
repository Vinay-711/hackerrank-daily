# beautiful-path

[Original practice problem](https://www.hackerrank.com/challenges/beautiful-path/problem)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the minimum bitwise OR path penalty. Since edge costs are up to 1023 (10 bits), we can use a Breadth-First Search (BFS) on the state space (node, current_or_penalty). The state space size is N * 1024, which is manageable. We explore all reachable states and track the minimum penalty that reaches node B. Time complexity is O((N+M) * 1024), space complexity is O(N * 1024).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
