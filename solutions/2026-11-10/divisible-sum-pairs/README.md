# divisible-sum-pairs

[Original practice problem](https://www.hackerrank.com/challenges/divisible-sum-pairs/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The problem is solved using a frequency array (remainder map) to count occurrences of each remainder when elements are divided by k. For each element, we calculate its remainder 'r'. We then check how many previous elements had a remainder that, when added to 'r', results in a sum divisible by k (i.e., (k - r) % k). This approach reduces the time complexity to O(n) and space complexity to O(k).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
