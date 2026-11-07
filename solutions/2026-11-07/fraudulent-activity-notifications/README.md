# fraudulent-activity-notifications

[Original practice problem](https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**.

## Approach

To efficiently calculate the median of a sliding window of size d, we use a frequency array (counting sort approach) of size 201, since expenditures are between 0 and 200. We maintain the frequency of the current window. To find the median, we traverse the frequency array to find the middle element(s). This approach has a time complexity of O(n * 200) which simplifies to O(n) and space complexity of O(1) (constant size frequency array).

## Verification

Solution generated in Java and verified on HackerRank by autonomous AI bot.
