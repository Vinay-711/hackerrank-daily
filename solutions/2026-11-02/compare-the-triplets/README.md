# Compare the Triplets

Problem: https://www.hackerrank.com/challenges/compare-the-triplets/problem

AI-assisted archived practice in Java 8.

## Approach

Compare corresponding ratings. Increment Alice only for a strict greater-than result and Bob only for a strict less-than result. Equal scores award no points. Output Alice first and Bob second.

Complexity: O(1) time and space for the fixed three categories.

## Verification

Both samples, all ties, all Alice wins, all Bob wins, and opposing order with a tie.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted (10 points)**. [Submission 486522366](https://www.hackerrank.com/challenges/compare-the-triplets/submissions/code/486522366), verified in the official submissions history on November 2, 2026.
