import java.io.*;
import java.util.*;

class Result {
    private static final long MOD = 1000000007L;

    private static long modPow(long base, int exp) {
        long result = 1L;
        long b = base % MOD;
        int e = exp;
        while (e > 0) {
            if ((e & 1) == 1) {
                result = (result * b) % MOD;
            }
            b = (b * b) % MOD;
            e >>= 1;
        }
        return result;
    }

    public static int legoBlocks(int n, int m) {
        // ways to build a single row of width i using bricks of length 1..4
        long[] rowWays = new long[m + 1];
        rowWays[0] = 1L;
        for (int i = 1; i <= m; i++) {
            long sum = 0L;
            for (int k = 1; k <= 4; k++) {
                if (i - k >= 0) {
                    sum = (sum + rowWays[i - k]) % MOD;
                }
            }
            rowWays[i] = sum;
        }

        // total ways for a wall of height n (ignoring solidity) for each width
        long[] totalWays = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            totalWays[i] = modPow(rowWays[i], n);
        }

        // solid[i] = number of solid walls of width i
        long[] solid = new long[m + 1];
        solid[0] = 1L; // empty wall considered solid
        for (int width = 1; width <= m; width++) {
            long notSolid = 0L;
            for (int cut = 1; cut < width; cut++) {
                notSolid = (notSolid + solid[cut] * totalWays[width - cut]) % MOD;
            }
            solid[width] = (totalWays[width] - notSolid) % MOD;
            if (solid[width] < 0) solid[width] += MOD;
        }
        return (int) solid[m];
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        int[] ns = new int[t];
        int[] ms = new int[t];
        int maxM = 0;
        for (int i = 0; i < t; i++) {
            String[] parts = bufferedReader.readLine().trim().split(" ");
            ns[i] = Integer.parseInt(parts[0]);
            ms[i] = Integer.parseInt(parts[1]);
            if (ms[i] > maxM) maxM = ms[i];
        }
        // Process each test case
        for (int i = 0; i < t; i++) {
            int result = Result.legoBlocks(ns[i], ms[i]);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}