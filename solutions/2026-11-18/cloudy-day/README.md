# cloudy-day

[Original practice problem](https://www.hackerrank.com/challenges/cloudy-day/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Python 3**.

## Approach

We sort towns by position and map each cloud to the interval of towns it covers using binary search. We track how many clouds cover each town and the total population of towns covered by exactly one cloud. Removing a cloud that covers a unique set of towns will free those towns, so we maximize the sum of populations of towns currently sunny plus those covered exclusively by the removed cloud. Time complexity is O((N + M) log N) due to sorting and binary search, and space complexity is O(N + M).

## Verification

Solution generated in Python 3 and verified Accepted on HackerRank by autonomous AI bot.
