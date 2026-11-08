# sherlock-and-anagrams

[Original practice problem](https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The approach uses a HashMap to store the frequency of sorted substrings. For every possible substring of length 1 to n-1, we sort its characters to create a canonical representation (anagram key). If the key exists in the map, it means we found previous occurrences that form anagrammatic pairs. The number of pairs is calculated using the combination formula n*(n-1)/2, or more simply by adding the current count of the key to the total and then incrementing the count. Time complexity is O(n^3 log n) due to substring generation and sorting, where n is the length of the string. Space complexity is O(n^2) to store the substring keys.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
