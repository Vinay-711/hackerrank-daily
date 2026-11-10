# cut-the-tree

[Original practice problem](https://www.hackerrank.com/challenges/cut-the-tree/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved by calculating the sum of all nodes in the tree, then performing a Depth First Search (DFS) to compute the subtree sum for every node. For each node (except the root), cutting the edge connecting it to its parent creates a subtree with sum S_sub and a remaining tree with sum (TotalSum - S_sub). The difference is |TotalSum - 2 * S_sub|. We track the minimum of these differences. Time complexity is O(N) and space complexity is O(N) to store the adjacency list and recursion stack.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
