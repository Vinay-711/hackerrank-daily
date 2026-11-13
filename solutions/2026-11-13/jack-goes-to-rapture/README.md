# jack-goes-to-rapture

[Original practice problem](https://www.hackerrank.com/challenges/jack-goes-to-rapture/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the minimum cost to travel from node 1 to node N. The cost rule is: if we are at node A with cumulative cost 'd' and move to node B with edge weight 'w', the new cost is max(d, w). This is because the cost to traverse an edge is max(0, w - d), so the new total cost is d + max(0, w - d) = max(d, w). This transforms the problem into finding a path where the maximum edge weight is minimized, which can be solved using Dijkstra's algorithm with a modified relaxation step: newCost = max(current_cost, edge_weight). Time complexity is O(E log V) and space complexity is O(V + E).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
