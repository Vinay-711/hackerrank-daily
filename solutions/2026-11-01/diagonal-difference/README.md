# Diagonal Difference

Problem: [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Accepted — 10 points**

## Approach

For every row i, accumulate the primary entry at column i minus the secondary entry at column n-1-i. The absolute value of that total equals the difference of the two diagonal sums. In odd dimensions the center cancels naturally.

## Complexity

O(n) time and O(1) auxiliary space beyond the input matrix. Submit the function in the platform’s supplied Python scaffold.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 33 cases passed. Tests are original and do not represent the hidden judge suite.

## Judge result

Status: **Accepted — 10 points**. Submission/log ID: `486436796`.

[Judge record](https://www.hackerrank.com/challenges/diagonal-difference/submissions/code/486436796). Verified in the logged-in platform UI on November 1, 2026. `submission.py` preserves the submitted code; `solution.py` is the independently tested reusable version.

AI-assisted archived practice; no rated contest participation is claimed.
