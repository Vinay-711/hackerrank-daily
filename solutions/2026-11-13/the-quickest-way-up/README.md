# the-quickest-way-up

[Original practice problem](https://www.hackerrank.com/challenges/the-quickest-way-up/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

We can model the Snakes and Ladders board as an unweighted directed graph with 100 vertices (squares 1 to 100). Each roll of a die (1 to 6) forms an edge to another square, which immediately redirects to the destination of a ladder or snake if present. To find the minimum number of rolls from square 1 to square 100, we perform a Breadth-First Search (BFS). Since all edge weights are equal to 1 roll, BFS guarantees finding the shortest path in O(V + E) time, where V = 100 and E <= 600, giving O(1) time and space complexity per test case.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
