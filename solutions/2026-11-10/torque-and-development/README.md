# torque-and-development

[Original practice problem](https://www.hackerrank.com/challenges/torque-and-development/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved by finding connected components in the graph of cities. For each component of size S, we can either build a library in every city (cost S * c_lib) or build one library and S-1 roads (cost c_lib + (S-1) * c_road). We choose the minimum of these two for each component. If c_lib <= c_road, it is always optimal to build a library in every city. Otherwise, we use DFS to find component sizes. Time complexity is O(N + M) and space complexity is O(N + M) to store the adjacency list.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
