# equal

[Original practice problem](https://www.hackerrank.com/challenges/equal/problem)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem asks for the minimum operations to equalize chocolates. Adding 1, 2, or 5 to all but one colleague is equivalent to subtracting 1, 2, or 5 from one colleague. To equalize, we target a value equal to or slightly less than the minimum element in the array (min - 0, min - 1, min - 2, min - 3, min - 4). For each target, we calculate the operations needed for each element: count = (diff/5) + ((diff%5)/2) + (((diff%5)%2)/1). We take the minimum total operations across these 5 possible targets. Time complexity: O(N), Space complexity: O(1).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
