# the-story-of-a-tree

[Original practice problem](https://www.hackerrank.com/challenges/the-story-of-a-tree/problem)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the probability that at least k guesses are correct given a randomly chosen root. A guess (u, v) is correct if u is the parent of v. We can root the tree arbitrarily at node 1 and count how many guesses are satisfied. If we move the root from a node u to an adjacent node v, the guess (u, v) becomes invalid and (v, u) becomes valid. We use DFS to calculate the number of satisfied guesses for the initial root (node 1) and then use a second DFS to propagate the counts to all other nodes. The time complexity is O(N + G) per test case, where N is the number of nodes and G is the number of guesses.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
