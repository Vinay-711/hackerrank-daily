# johnland

[Original practice problem](https://www.hackerrank.com/challenges/johnland/problem)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the sum of minimum distances between all pairs of cities in a graph where edge weights are powers of two. Since the graph is connected and we want minimum distances, we first construct the Minimum Spanning Tree (MST) using Kruskal's algorithm. In a tree, the path between any two nodes is unique. The contribution of an edge with weight 2^k to the total sum is (count of paths passing through it) * 2^k. An edge splits the tree into two components of size S and (N-S), so it is used in S * (N-S) paths. We calculate these counts for each edge, propagate the carries to handle the binary representation, and output the result. Time complexity is O(M log M) for sorting edges and O(N) for tree traversal and bit processing.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
