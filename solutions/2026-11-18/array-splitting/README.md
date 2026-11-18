# array-splitting

[Original practice problem](https://www.hackerrank.com/challenges/array-splitting/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

We use recursion on sub‑arrays. For a segment [l..r] we compute its total sum using a prefix‑sum array. If the total is 0 we can always split off one element, giving (length‑1) further points. If the total is odd, no equal split exists. Otherwise we look for an index i where the left sum equals total/2 (i.e., prefix[i] == prefix[l‑1] + total/2). When such i exists we earn one point and continue with the better of the two resulting parts: 1 + max(solve(l,i), solve(i+1,r)). The recursion stops when the segment size is 1 or no split is possible.
Time Complexity: In the worst case each recursion scans the current segment once, leading to O(n log n) on average (segments shrink roughly by half) and O(n²) in pathological cases, which fits the given constraints. Space Complexity: O(n) for the prefix array plus O(log n) recursion stack.

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
