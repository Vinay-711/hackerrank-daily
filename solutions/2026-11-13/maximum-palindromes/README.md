# maximum-palindromes

[Original practice problem](https://www.hackerrank.com/challenges/maximum-palindromes/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025964`

## Approach

To solve this, we count the frequency of each character in the substring [l, r] using a 2D prefix sum array (prefix[26][n+1]). For a palindrome, characters with odd counts contribute to the center (at most one odd count allowed). If multiple characters have odd counts, we pick one to be the center and divide the others by 2 to form the sides. The number of ways to arrange the half-string is (sum of half-counts)! / product of (half-count_i!). We multiply this by the number of choices for the center character (the count of characters with odd frequencies). We use precomputed factorials and modular inverse for combinations.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
