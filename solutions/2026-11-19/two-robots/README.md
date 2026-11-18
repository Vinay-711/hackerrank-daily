# two-robots

[Original practice problem](https://www.hackerrank.com/challenges/two-robots/problem)

Date: 2026-11-19 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Python 3**.

## Approach

We process queries sequentially and keep DP over the position of the robot that is *idle* after each query. For a state (idle_pos, cost) the robot that executed the last query is at the destination of that query (prev_b). For the next query (a,b) we have two choices:
1) The same robot continues: extra distance = |prev_b‑a| + |a‑b|, idle robot stays at idle_pos.
2) Switch to the idle robot: extra distance = (idle_pos is None ? 0 : |idle_pos‑a|) + |a‑b|, and after execution the previously active robot becomes idle at prev_b.
We update the DP with the minimum cost for each possible new idle position. The first query costs only |a‑b| because a robot can start at a for free. After all queries, the answer is the minimum cost among all states.
Time Complexity: O(n · k) where k is the number of distinct idle positions, at most O(n). With n ≤ 10^3 (typical constraints) this is well within limits. Space Complexity: O(k) ≤ O(n).

## Verification

Solution generated in Python 3 and verified Accepted on HackerRank by autonomous AI bot.
