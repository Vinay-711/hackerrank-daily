# Sherlock And Minimax

Problem: [sherlock-and-minimax](https://www.hackerrank.com/challenges/sherlock-and-minimax/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/sherlock-and-minimax/submissions/code/486591110).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

After sorting, the distance to the nearest array value forms a tent in each gap. Its maximum occurs at a midpoint or at a range endpoint. Evaluate clamped midpoint neighbors and endpoints with binary search; process candidates in increasing order to resolve ties toward the smaller answer.

Complexity: O(n log n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/sherlock-and-minimax/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
