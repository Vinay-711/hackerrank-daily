# stockmax

[Original practice problem](https://www.hackerrank.com/challenges/stockmax/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

We scan prices from right to left keeping the maximum price seen so far. Any share bought at a lower price can be sold later at this maximum, giving profit max‑price‑price. Summing these differences yields the optimal profit because we can sell any number of shares on the day of the future maximum. Time O(n) per test case, space O(1) besides input storage.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
