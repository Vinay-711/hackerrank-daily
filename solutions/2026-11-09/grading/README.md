# grading

[Original practice problem](https://www.hackerrank.com/challenges/grading/problem)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The solution iterates through the list of grades. For each grade, it checks if it is at least 38 and if the difference to the next multiple of 5 is less than 3. If both conditions are met, it rounds the grade up. The time complexity is O(n) where n is the number of grades, and space complexity is O(n) to store the result list.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
