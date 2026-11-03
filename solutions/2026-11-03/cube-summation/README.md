# Cube Summation

Problem: [cube-summation](https://www.hackerrank.com/challenges/cube-summation/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/cube-summation/submissions/code/486590858).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Maintain point assignment values separately so assignments become difference updates in a 3-D Fenwick tree. Answer a box with inclusion-exclusion over its eight prefix corners. Negative updates and repeated assignments are preserved exactly in long.

Complexity: O((updates+queries) log^3 n) time and O(n^3) space.

## Verification

Run `python3 solutions/2026-11-03/cube-summation/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
