# bfsshortreach

[Original practice problem](https://www.hackerrank.com/challenges/bfsshortreach/problem)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using Breadth-First Search (BFS) to find the shortest path in an unweighted graph where each edge has a weight of 6. We represent the graph using an adjacency list. We initialize a distance array with -1. Starting from the source node, we traverse the graph level by level, updating distances as (current_distance + 6). Time complexity is O(N + M) and space complexity is O(N + M) per query.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
