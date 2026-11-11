# kruskalmstrsub

[Original practice problem](https://www.hackerrank.com/challenges/kruskalmstrsub/problem)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the Minimum Spanning Tree (MST) weight. I used Kruskal's algorithm with a Disjoint Set Union (DSU) data structure. Edges are sorted primarily by weight, and secondarily by the sum of their endpoints (u + v + weight) to handle the tie-breaking rule. The time complexity is O(E log E) due to sorting, and space complexity is O(V + E) to store the graph and DSU structure.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
