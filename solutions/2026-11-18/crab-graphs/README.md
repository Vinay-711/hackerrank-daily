# crab-graphs

[Original practice problem](https://www.hackerrank.com/challenges/crab-graphs/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks to find the maximum number of vertices covered by vertex-disjoint crab subgraphs. A crab consists of one head and K feet, with K edges connecting the head to each foot, where 1 <= K <= T. 'Vertex-disjoint' means that no node can be part of more than one crab (either as a head or as a foot). The goal is to maximize the total count of unique nodes used across all selected crabs.

This problem can be modeled as a maximum flow problem. The provided starter code sets up a flow network, but its final calculation of covered vertices is incorrect for strictly vertex-disjoint subgraphs.

**Flow Network Construction (as in starter code):**
1.  **Source (0)** and **Sink (2N+1)** nodes.
2.  **Head Nodes (1 to N):** For each original graph node `i`, a node `i` in the flow network represents `i` as a potential head.
3.  **Foot Nodes (N+1 to 2N):** For each original graph node `j`, a node `N+j` in the flow network represents `j` as a potential foot.

**Edges and Capacities:**
1.  **`Source -> Head_i`:** An edge from `source` to each head node `i` with capacity `T`. This limits the number of feet a head `i` can have to `T`.
2.  **`Head_i -> Foot_j`:** For every edge `(i, j)` in the original graph, an edge from head node `i` to foot node `N+j` with capacity `1`. This means `j` can be a foot for `i` at most once.
3.  **`Foot_j -> Sink`:** An edge from each foot node `N+j` to `sink` with capacity `1`. This ensures that each original node `j` can be used as a foot at most once across all crabs.

**Max Flow Calculation:**
Edmonds-Karp algorithm (BFS-based) is used to find the maximum flow from `source` to `sink`. Each unit of flow represents one foot being successfully assigned to a head. Therefore, the total `flow` value is the total number of feet used (`totalFeet`).

**Corrected Result Calculation:**
After computing the max flow, the original starter code calculates `headsUsed` as the count of distinct nodes that act as heads, and then returns `headsUsed + totalFeet`. This is incorrect because it double-counts any node that is both a head and a foot, violating the strict 'vertex-disjoint' constraint.

To correctly calculate the maximum number of *unique* vertices covered, we need to find the union of the set of heads and the set of feet. This can be expressed as: `|HeadsSet UNION FeetSet| = |HeadsSet| + |FeetSet| - |HeadsSet INTERSECT FeetSet|`.

1.  **Identify `HeadsSet`:** Iterate through all original nodes `i`. A node `i` is a head if there was flow from `i` to `N+neighbor` for at least one `neighbor`. In the residual graph, this is indicated by `capacity[N+neighbor][i] == 1` (a backward edge with capacity 1).
2.  **Identify `FeetSet`:** Iterate through all original nodes `i`. A node `i` is a foot if there was flow from `N+i` to `sink`. In the residual graph, this is indicated by `capacity[sink][N+i] == 1` (a backward edge with capacity 1).
3.  **Calculate `headsUsed`:** This is simply `HeadsSet.size()`.
4.  **Calculate `totalFeet`:** This is the `flow` value obtained from the max flow algorithm, which correctly represents `FeetSet.size()` because each unit of flow corresponds to a unique foot.
5.  **Calculate `intersectionCount`:** Iterate through `HeadsSet` and check how many of its elements are also present in `FeetSet`.
6.  **Final Result:** Return `headsUsed + totalFeet - intersectionCount`.

**Time and Space Complexity:**
*   **Graph Construction:** O(N + M) for adjacency list. Flow network construction is O(N + M).
*   **Max Flow (Edmonds-Karp):** The number of vertices in the flow network is `V = 2N+2`. The number of edges is `E = N + M + N = 2N+M`. The maximum flow `F` can be up to `N * T`. The complexity of Edmonds-Karp is `O(F * E)`. Given `N=100`, `T=100`, `M=N*(N-1)/2 = 4950`:
    *   `V = 202`
    *   `E = 2*100 + 4950 = 5150`
    *   `F = 100 * 100 = 10000`
    *   Time Complexity: `O(10000 * 5150) = O(5.15 * 10^7)` per test case. For `C=10` test cases, this is `O(5.15 * 10^8)`, which might be on the higher side but often passes within typical time limits for competitive programming platforms due to average case performance or weaker test data.
*   **Result Calculation:** O(N + M) to iterate through residual capacities and populate sets, then O(N) to find intersection. This is negligible compared to max flow.
*   **Space Complexity:** O(V^2) for the capacity matrix (adjacency matrix representation) which is `O((2N+2)^2) = O(N^2)`. For `N=100`, this is `202^2` integers, which is `~40000` integers, well within memory limits. Adjacency list for original graph and sets for heads/feet take O(N+M) space.

This approach correctly handles the vertex-disjoint constraint by explicitly calculating the union of heads and feet.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
