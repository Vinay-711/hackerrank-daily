# sherlock-and-anagrams

[Original practice problem](https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.
Submission ID: `487025969`

## Approach

The approach uses a HashMap to store the frequency of sorted substrings of all possible lengths. For each substring, we sort its characters to create a canonical representation (anagram key). If a key appears 'n' times, it contributes n*(n-1)/2 pairs. The time complexity is O(N^3 log N) due to substring generation and sorting, where N is the string length, which is efficient enough for N <= 100.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
