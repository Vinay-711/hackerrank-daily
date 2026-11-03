# Find The Running Median

Problem: [find-the-running-median](https://www.hackerrank.com/challenges/find-the-running-median/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/find-the-running-median/submissions/code/486591241).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Keep the lower half in a max heap and the upper half in a min heap, with the lower heap holding the extra element for odd sizes. Their roots determine the median. Print an exact one-decimal representation without floating-point accumulation.

Complexity: O(n log n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/find-the-running-median/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
