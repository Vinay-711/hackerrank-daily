import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
        int n = a.size();
        int m = b.size();
        int[] arrA = new int[n];
        int[] arrB = new int[m];
        for (int i = 0; i < n; i++) arrA[i] = a.get(i);
        for (int j = 0; j < m; j++) arrB[j] = b.get(j);
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            int ai = arrA[i - 1];
            for (int j = 1; j <= m; j++) {
                if (ai == arrB[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j] >= dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        // Reconstruct LCS
        List<Integer> rev = new ArrayList<>();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (arrA[i - 1] == arrB[j - 1]) {
                rev.add(arrA[i - 1]);
                i--; j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        Collections.reverse(rev);
        return rev;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.longestCommonSubsequence(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}