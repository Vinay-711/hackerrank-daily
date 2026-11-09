# pairs

[Original practice problem](https://www.hackerrank.com/challenges/pairs/problem)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

I used a HashSet to store all elements of the array for O(1) average time complexity lookups. For each element x in the array, I check if (x + k) exists in the set. This approach has O(n) time complexity and O(n) space complexity.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
