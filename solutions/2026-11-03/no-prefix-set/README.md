# No Prefix Set

Problem: [no-prefix-set](https://www.hackerrank.com/challenges/no-prefix-set/problem)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerrank.com/challenges/no-prefix-set/submissions/code/486591565).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

In lexical order, a new word only needs to be checked against its closest earlier and later neighbors. A previous word that prefixes it appears at its floor, and any existing word having it as prefix appears at its ceiling. Stop recording at the first input-order violation, including duplicates.

Complexity: O(total characters * log n) time and O(total characters) space.

## Verification

Run `python3 solutions/2026-11-03/no-prefix-set/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
