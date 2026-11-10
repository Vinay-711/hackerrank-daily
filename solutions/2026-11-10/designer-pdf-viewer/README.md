# designer-pdf-viewer

[Original practice problem](https://www.hackerrank.com/challenges/designer-pdf-viewer/problem)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

The approach iterates through each character of the input string to find the maximum height among the characters present, using the provided list of heights. Since each character has a width of 1, the total area is simply the maximum height multiplied by the length of the string. Time complexity is O(N) where N is the length of the word, and space complexity is O(1) as we only store a few integer variables.

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
