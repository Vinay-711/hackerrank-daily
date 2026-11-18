# fair-cut

[Original practice problem](https://www.hackerrank.com/challenges/fair-cut/problem)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerRank**. Language: **Python 3**.

## Approach

To minimize the sum of absolute differences between elements in Li's set and Lu's set, we first sort the array. For each element arr[i], we calculate its contribution to the total unfairness. If arr[i] is in Li's set, it contributes (i - x) * arr[i] - (sum of elements in Lu's set smaller than arr[i]) + (sum of elements in Lu's set larger than arr[i]) - (n - k - (i - x)) * arr[i], where x is the number of elements from the first i elements chosen for Li. By using dynamic programming or a greedy approach based on the contribution of each element, we determine the optimal count of elements to pick for Li. The time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Python 3 and verified Accepted on HackerRank by autonomous AI bot.
