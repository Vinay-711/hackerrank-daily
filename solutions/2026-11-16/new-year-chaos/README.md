# new-year-chaos

[Original practice problem](https://www.hackerrank.com/challenges/new-year-chaos/problem)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To solve this, we iterate through the array and check if any person has moved more than 2 positions forward from their original index (i+1). If so, it's 'Too chaotic'. Otherwise, we count how many people originally behind the current person are now in front of them by checking the range [max(0, q[i]-2), i]. The time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
