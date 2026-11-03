# Median

Problem: [median](https://www.hackerrank.com/challenges/median/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/median/submissions/code/486591429).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Read operations once to compress all signed values. A Fenwick tree of frequencies supports insertion, deletion and order-statistic selection in logarithmic time. Reject missing removals without changing the multiset; print Wrong! for empty results. Format half-integers exactly, including negative zero-point-five.

Complexity: O(n log n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/median/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
