# even-tree

[Original practice problem](https://www.hackerrank.com/challenges/even-tree/problem)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using a post-order traversal (DFS). For each node, we calculate the size of the subtree rooted at that node. If a subtree has an even number of nodes, removing the edge connecting this subtree to its parent creates a valid component (since the remaining part of the tree will also have an even number of nodes, given the total nodes are even). We count such edges. Time complexity is O(N) where N is the number of nodes, and space complexity is O(N) for the adjacency list and recursion stack.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
