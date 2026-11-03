# Poisonous Plants

Problem: [poisonous-plants](https://www.hackerrank.com/challenges/poisonous-plants/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/poisonous-plants/submissions/code/486591829).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Use a monotonic stack of surviving blockers and their death days. Pop plants that cannot kill the current plant, remembering the longest delay until they disappear. If a smaller blocker remains, the current plant dies one day after that delay; otherwise it never dies. The maximum death day is the stabilization time.

Complexity: O(n) time and O(n) space.

## Verification

Run `python3 solutions/2026-11-03/poisonous-plants/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
