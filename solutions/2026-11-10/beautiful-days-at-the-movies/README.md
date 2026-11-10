# beautiful-days-at-the-movies

[Original practice problem](https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The solution iterates through the range [i, j]. For each number, it calculates the reverse by repeatedly taking the modulo 10 and multiplying the accumulator by 10. It then checks if the absolute difference between the number and its reverse is divisible by k. The time complexity is O(N * D) where N is the number of days in the range and D is the number of digits in the integers, and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
