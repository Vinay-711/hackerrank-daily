# Time Conversion

Problem: [time-conversion](https://www.hackerrank.com/challenges/time-conversion/problem)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.hackerrank.com/challenges/time-conversion/submissions/code/486565432).

## Approach

Map 12 to zero with modulo 12, then add 12 for PM. Keep minutes and seconds unchanged, remove the suffix, and pad the converted hour to two digits.

Complexity: O(1) time and space for fixed-length timestamps.

## Verification

Run `python3 solutions/2026-11-03/time-conversion/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
