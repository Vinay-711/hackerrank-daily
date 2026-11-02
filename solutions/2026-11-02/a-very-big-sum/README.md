# A Very Big Sum

Problem: https://www.hackerrank.com/challenges/a-very-big-sum/problem

AI-assisted archived practice in Java 8.

## Approach

Read each value as a Java long and accumulate into a long, avoiding 32-bit overflow in both parsing and summation. The maximum permitted total is 10^11, which fits comfortably in 64 bits.

Complexity: O(n) time and O(1) auxiliary space.

## Verification

Sample, zero, ten values of 10^10, a sum exceeding Integer.MAX_VALUE, and deterministic random input, checked using Python arbitrary-precision integers.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted (10 points)**. [Submission 486522501](https://www.hackerrank.com/challenges/a-very-big-sum/submissions/code/486522501), verified in the official submissions history on November 2, 2026.
