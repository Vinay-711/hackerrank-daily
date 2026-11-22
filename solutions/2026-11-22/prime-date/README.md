# prime-date

[Original practice problem](https://www.hackerrank.com/challenges/prime-date/problem)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Java**.

## Approach

The solution iterates through each date from the start date to the end date. For each date, it constructs the concatenated integer and checks if it is divisible by 4 or 7. The bugs in the original code were fixed: the leap year logic was corrected, the concatenation multiplier was changed from 1000 to 10000, the divisibility condition was changed from AND to OR, and the month reset was corrected to 1 instead of 13. The time complexity is O(N) where N is the number of days in the range, and the space complexity is O(1).

## Verification

Solution generated in Java and verified Accepted on HackerRank by autonomous AI bot.
