# maximum-palindromes

[Original practice problem](https://www.hackerrank.com/challenges/maximum-palindromes/problem)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To find the number of maximum-length palindromes, we count the frequency of each character in the substring [l, r]. Let 'odd' be the number of characters with odd frequencies. The maximum length is (r - l + 1) - max(0, odd - 1). The number of ways to arrange the characters is ( (total_pairs)! / product(count_i/2!) ) * max(1, odd). We use prefix sums to count character frequencies in O(1) per query and precompute factorials and their modular inverses for O(1) combinations. Time complexity: O(N + Q), Space complexity: O(N).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
