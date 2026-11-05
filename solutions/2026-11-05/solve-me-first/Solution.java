/* ==============================================================================
 * Platform: HackerRank
 * Language: Java
 * URL: https://www.hackerrank.com/challenges/solve-me-first/problem
 * Generated: 2026-11-05 11:17:31
 *
 * Approach:
 * The problem asks to calculate the sum of two integers, a and b. We return the result of standard addition (a + b).

Time Complexity: O(1)
Space Complexity: O(1)
 * ==============================================================================
 */

import java.util.Scanner;

public class Solution {

    public static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
