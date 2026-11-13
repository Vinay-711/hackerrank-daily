# gena

[Original practice problem](https://www.hackerrank.com/challenges/gena/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

We can model Gena's Hanoi puzzle as a shortest-path problem on an unweighted state-space graph using Breadth-First Search (BFS).

Since there are 4 rods and N <= 10 disks, each disk's rod location (0 to 3) can be represented using 2 bits. The state of all N disks can be encoded into a single integer of 2N bits (at most 20 bits, corresponding to 4^N <= 1,048,576 states).

From any state, only the smallest disk on each of the 4 rods (the top disk) can be moved. A top disk can be moved to another rod if that rod is either empty or its top disk is larger than the disk being moved. We search level by level starting from the initial configuration until all disks are on rod 1 (encoded as state 0).

Time Complexity: O(4^N * N), which takes at most ~10^7 operations for N = 10, running in under 50ms.
Space Complexity: O(4^N) for distance and queue arrays, taking ~8MB memory for N = 10.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
