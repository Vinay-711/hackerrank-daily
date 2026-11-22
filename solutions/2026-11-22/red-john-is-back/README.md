# red-john-is-back

[Original practice problem](https://www.hackerrank.com/challenges/red-john-is-back/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

The tiling count follows f(n)=f(n-1)+f(n-4) with base f(0..3)=1, computed via DP. For each n we count primes ≤ f(n) by trial division. Time: O(maxN) for DP plus O(t·√fmax) for prime checks; Space: O(maxN) for DP array.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
