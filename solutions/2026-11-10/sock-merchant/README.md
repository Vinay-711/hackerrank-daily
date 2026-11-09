# sock-merchant

[Original practice problem](https://www.hackerrank.com/challenges/sock-merchant/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved by counting the frequency of each sock color using a HashSet to track unpaired socks. When a color is encountered that is already in the set, a pair is formed, the count is incremented, and the color is removed from the set. This approach has O(n) time complexity and O(n) space complexity.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
