# lego-blocks

[Original practice problem](https://www.hackerrank.com/challenges/lego-blocks/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

For each row we can place bricks of length 1‑4, so the number of ways to fill a width i is dpRow[i] = dpRow[i‑1]+dpRow[i‑2]+dpRow[i‑3]+dpRow[i‑4] (dpRow[0]=1). A wall of height n is just n independent rows, therefore totalWays[i] = (dpRow[i])^n (mod 1e9+7).
A wall is *solid* if there is no vertical line that runs from top to bottom through a gap. Let solid[i] be the number of solid walls of width i. Any non‑solid wall has a first vertical crack at some position k (1 ≤ k < i). The left part (width k) must be solid, the right part can be any wall: solid[k] * totalWays[i‑k]. Summing over all possible k gives the number of non‑solid walls. Hence:
    solid[i] = totalWays[i] – Σ_{k=1}^{i‑1} solid[k] * totalWays[i‑k] (mod MOD).
We compute solid[1…m] iteratively. The answer is solid[m].
Complexities: building dpRow O(m), computing totalWays O(m) (each with fast exponentiation O(log n)), and the solid DP O(m^2). Memory O(m).

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
