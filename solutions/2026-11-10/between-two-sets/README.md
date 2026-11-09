# between-two-sets

[Original practice problem](https://www.hackerrank.com/challenges/between-two-sets/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for integers x such that all elements in array 'a' are factors of x, and x is a factor of all elements in array 'b'. This means x must be a multiple of the Least Common Multiple (LCM) of array 'a' and a divisor of the Greatest Common Divisor (GCD) of array 'b'. We iterate through multiples of the LCM of 'a' up to the minimum element of 'b', checking if each multiple divides the GCD of 'b'. Time complexity is O(N + M + (max(b)/lcm(a))), space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
