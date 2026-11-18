import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int substringDiff(int k, String s1, String s2) {
        int n = s1.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, solve(k, s1, s2, i, 0));
        }

        for (int j = 1; j < n; j++) {
            maxLen = Math.max(maxLen, solve(k, s1, s2, 0, j));
        }

        return maxLen;
    }

    private static int solve(int k, String s1, String s2, int startX, int startY) {
        int n = s1.length();
        int m = s2.length();
        int maxLen = 0;
        int left = 0;
        int mismatches = 0;

        for (int right = 0; startX + right < n && startY + right < m; right++) {
            if (s1.charAt(startX + right) != s2.charAt(startY + right)) {
                mismatches++;
            }

            while (mismatches > k) {
                if (s1.charAt(startX + left) != s2.charAt(startY + left)) {
                    mismatches--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int k = Integer.parseInt(firstMultipleInput[0]);

                String s1 = firstMultipleInput[1];

                String s2 = firstMultipleInput[2];

                int result = Result.substringDiff(k, s1, s2);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}