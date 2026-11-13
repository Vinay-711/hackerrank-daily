# primsmstsub

[Original practice problem](https://www.hackerrank.com/challenges/primsmstsub/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

Prim's algorithm is used to find the Minimum Spanning Tree (MST) of a weighted, connected graph starting from a specified node. We represent the graph using an adjacency list and use a PriorityQueue to greedily select the edge with the minimum weight connected to an already visited vertex. The time complexity is O(M log N) where N is the number of nodes and M is the number of edges, and the space complexity is O(N + M).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
