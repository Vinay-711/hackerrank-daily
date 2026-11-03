# Birthday Cake Candles

Problem: [birthday-cake-candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.hackerrank.com/challenges/birthday-cake-candles/submissions/code/486565349).

## Approach

Maintain the greatest height seen and the number of occurrences of that height. A new greater height resets the count; equal heights increment it.

Complexity: O(n) time and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/birthday-cake-candles/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
