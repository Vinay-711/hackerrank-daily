# Diagonal Difference

Problem: [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Prepared — locally tested; not submitted to the platform.**

## Approach

For every row i, accumulate the primary entry at column i minus the secondary entry at column n-1-i. The absolute value of that total equals the difference of the two diagonal sums. In odd dimensions the center cancels naturally.

## Complexity

O(n) time and O(1) auxiliary space beyond the input matrix. Submit the function in the platform’s supplied Python scaffold.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 33 cases passed. Tests are original and do not represent the hidden judge suite.

## Submission blocker

Browser automation connection failed (Debugger unattached) before account history and judge submission could be verified. Prior accepted status is unknown; this is not claimed as a new platform solve. Automated-submission permission must be verified before a later submission.

AI-assisted practice solution; no contest participation or rating change is claimed.
