import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int sansaXor(List<Integer> arr) {
        int n = arr.size();
        if ((n & 1) == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            ans ^= arr.get(i);
        }
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            int result = Result.sansaXor(arr);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}