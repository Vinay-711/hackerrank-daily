# Mini Max Sum

Problem: [mini-max-sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.hackerrank.com/challenges/mini-max-sum/submissions/code/486565213).

## Approach

Every four-element sum excludes exactly one element. Excluding the maximum minimizes the sum; excluding the minimum maximizes it. Use long throughout to avoid 32-bit overflow.

Complexity: O(n) time for n=5 and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/mini-max-sum/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
