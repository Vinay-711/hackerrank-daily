import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int arraySplitting(List<Integer> arr) {
        int n = arr.size();
        long[] prefix = new long[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = arr.get(i) + (i > 0 ? prefix[i - 1] : 0);
        }
        return solve(0, n - 1, prefix);
    }

    private static int solve(int l, int r, long[] prefix) {
        if (l >= r) {
            return 0;
        }
        long total = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        if (total == 0) {
            // we can split off one element at a time
            return r - l;
        }
        if ((total & 1L) == 1L) { // odd total cannot be split equally
            return 0;
        }
        long target = (l > 0 ? prefix[l - 1] : 0) + total / 2;
        for (int i = l; i < r; i++) { // split point must leave non‑empty right part
            if (prefix[i] == target) {
                int leftScore = solve(l, i, prefix);
                int rightScore = solve(i + 1, r, prefix);
                return 1 + Math.max(leftScore, rightScore);
            }
        }
        return 0;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for (int tItr = 0; tItr < t; tItr++) {
            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            int result = Result.arraySplitting(arr);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}