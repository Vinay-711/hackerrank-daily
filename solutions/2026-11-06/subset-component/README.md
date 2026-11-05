# subset-component

[Original practice problem](https://www.hackerrank.com/challenges/subset-component/problem)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted** (Score: 60.0 / 60.0). Platform: **HackerRank**. Difficulty: **Hard**.

## Approach

Branch-and-bound recursive subset generation tracking connected component bitmasks. Zero/single-bit elements are factored out via powers of 2. Achieves O(2^d) optimal performance with bitwise operations.

## Verification

Compiled cleanly with `javac` and verified Accepted with full score on live HackerRank judge.
