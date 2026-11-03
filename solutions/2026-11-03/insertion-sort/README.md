# Insertion Sort

Problem: [insertion-sort](https://www.hackerrank.com/challenges/insertion-sort/problem)

Difficulty: **Advanced (official HackerRank classification)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/insertion-sort/submissions/code/486590496).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Every insertion-sort shift corresponds to an inversion. Merge sort counts cross inversions when taking a right element before the remaining larger left elements. Equal values are taken from the left and do not count. Use long for counts exceeding 32 bits.

Complexity: O(n log n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/insertion-sort/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
