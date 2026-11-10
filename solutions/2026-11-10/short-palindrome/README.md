# short-palindrome

[Original practice problem](https://www.hackerrank.com/challenges/short-palindrome/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To count the number of tuples (i, j, k, l) such that s[i] == s[l] and s[j] == s[k], we iterate through the string and maintain counts of: 1) occurrences of each character (c1), 2) pairs of characters (c2[char1][char2]), and 3) triplets (c3[char]). For each character 'x' at the current index, we update the count of 4-tuples by adding the number of existing triplets that end with 'x', update the triplets by adding the number of existing pairs (y, x), update the pairs by adding the number of occurrences of each character 'y', and finally increment the count of 'x'. Time complexity is O(N * 26), space complexity is O(26^2).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
