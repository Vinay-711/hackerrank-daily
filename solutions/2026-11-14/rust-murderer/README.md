# rust-murderer

[Original practice problem](https://www.hackerrank.com/challenges/rust-murderer/problem)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for shortest paths in the complement graph. Since the graph is sparse, the complement graph is dense. We use BFS to find shortest paths. To efficiently iterate over unvisited nodes in the complement graph, we maintain a doubly-linked list of unvisited nodes. For each node extracted from the queue, we iterate through the linked list and remove nodes that are NOT connected to the current node in the original graph (meaning they ARE connected in the complement graph). This ensures each node is visited and removed from the list exactly once, resulting in O(N + M) time complexity.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
