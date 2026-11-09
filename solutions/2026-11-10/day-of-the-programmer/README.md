# day-of-the-programmer

[Original practice problem](https://www.hackerrank.com/challenges/day-of-the-programmer/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem requires handling three distinct calendar periods: Julian (1700-1917), the transition year (1918), and Gregorian (1919-2700). In the Julian calendar, leap years are divisible by 4. In the Gregorian calendar, leap years are divisible by 400 or (divisible by 4 and not 100). In 1918, February had only 15 days (32nd day was Feb 14), shifting the 256th day by 13 days. The time complexity is O(1) as it involves simple conditional checks.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
