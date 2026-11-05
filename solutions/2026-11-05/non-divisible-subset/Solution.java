import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] count = new int[k];
        for (int x : s) {
            count[x % k]++;
        }

        int result = 0;
        if (count[0] > 0) {
            result++;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                if (count[i] > 0) {
                    result++;
                }
            } else {
                result += Math.max(count[i], count[k - i]);
            }
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(