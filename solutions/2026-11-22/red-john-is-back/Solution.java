import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static int redJohn(int n) {
        // This method will be called per test case, but we need DP across calls.
        // To avoid recomputing, we compute DP lazily using a static cache.
        return (int) countPrimesUpTo(getWays(n));
    }

    // Cache for DP values
    private static List<Long> dp = new ArrayList<>();

    private static long getWays(int n) {
        // Ensure dp size >= n+1
        while (dp.size() <= n) {
            int i = dp.size();
            long val;
            if (i == 0) {
                val = 1L; // empty board
            } else if (i < 4) {
                val = 1L; // only vertical bricks
            } else {
                val = dp.get(i - 1) + dp.get(i - 4);
            }
            dp.add(val);
        }
        return dp.get(n);
    }

    private static long countPrimesUpTo(long limit) {
        if (limit < 2) return 0L;
        long count = 0;
        for (long i = 2; i <= limit; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    private static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if ((x & 1) == 0) return false;
        long sqrt = (long) Math.sqrt(x);
        for (long d = 3; d <= sqrt; d += 2) {
            if (x % d == 0) return false;
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            int result = Result.redJohn(n);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}