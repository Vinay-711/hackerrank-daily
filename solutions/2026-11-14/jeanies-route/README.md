# jeanies-route

[Original practice problem](https://www.hackerrank.com/challenges/jeanies-route/problem)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the minimum distance to visit all target cities in a tree. This is equivalent to finding the weight of the minimal subtree containing all target cities, which is 2 * (sum of weights of edges in the minimal subtree) - (diameter of the minimal subtree). We prune the original tree by removing branches that do not contain any target cities. Then, we find the diameter of the remaining tree using two BFS traversals. Time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
