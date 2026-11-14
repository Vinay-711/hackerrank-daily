import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static long candies(int n, List<Integer> arr) {
        if (n == 0) return 0;
        long[] c = new long[n];
        Arrays.fill(c, 1);

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                c[i] = c[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                c[i] = Math.max(c[i], c[i + 1] + 1);
            }
        }

        long totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += c[i];
        }

        return totalCandies;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());

        List<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        long result = Result.candies(n, arr);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}