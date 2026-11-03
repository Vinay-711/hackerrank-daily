# Angry Children 2

Problem: [angry-children-2](https://www.hackerrank.com/challenges/angry-children-2/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/angry-children-2/submissions/code/486592001).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Sort the packet sizes. An optimal selection can be chosen as k consecutive sorted values: replacing an outer selected value toward a missing interior value never increases the total pairwise distance. Compute the first window with coefficients 2i-k+1. When sliding, subtract distances from the departing minimum and add distances to the entering maximum using a prefix sum of the remaining k-1 values. Use long for pairwise sums.

Complexity: O(n log n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/angry-children-2/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
