# synchronous-shopping

[Original practice problem](https://www.hackerrank.com/challenges/synchronous-shopping/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

We can model the problem as finding shortest paths in a state-space graph using Dijkstra's algorithm. Each state is represented by a pair `(u, mask)`, where `u` is the current shopping center (from 0 to N-1) and `mask` is a bitmask of length K representing the types of fish purchased so far. There are N * 2^K states (at most 1000 * 1024 ≈ 10^6 states) and 2M * 2^K transitions. After running Dijkstra to find the minimum travel time `dist[N-1][mask]` for a single cat to end at shopping center N with fish set `mask`, we iterate over all pairs of masks (m1, m2) such that `(m1 | m2) == (1 << K) - 1`. The minimum required time for both cats to meet at center N having collected all fish is `min(max(dist[N-1][m1], dist[N-1][m2]))` over all valid pairs.

Time Complexity: O(M * 2^K * log(N * 2^K))
Space Complexity: O(N * 2^K + M)

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
