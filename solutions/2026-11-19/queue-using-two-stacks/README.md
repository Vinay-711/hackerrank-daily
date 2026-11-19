# queue-using-two-stacks

[Original practice problem](https://www.hackerrank.com/challenges/queue-using-two-stacks/problem)

Date: 2026-11-19 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

Each element is moved at most once between the two stacks, so the total time is O(Q). Stack operations are O(1) amortized, giving O(1) per query on average. The two stacks store at most all queued elements, so the extra space is O(N) where N is the maximum queue size.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
