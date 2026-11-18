import java.io.*;
import java.util.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long result = 0L;
        // First pass: compute lengths of consecutive equal characters
        int[] groupLen = new int[n]; // at most n groups
        char[] groupChar = new char[n];
        int groups = 0;
        int i = 0;
        while (i < n) {
            char cur = s.charAt(i);
            int cnt = 0;
            while (i < n && s.charAt(i) == cur) {
                i++;
                cnt++;
            }
            groupChar[groups] = cur;
            groupLen[groups] = cnt;
            groups++;
            // substrings where all characters are the same
            result += (long) cnt * (cnt + 1) / 2;
        }
        // Second pass: substrings of type 2 (a single different middle character)
        for (int g = 1; g < groups - 1; g++) {
            if (groupLen[g] == 1 && groupChar[g - 1] == groupChar[g + 1]) {
                result += Math.min(groupLen[g - 1], groupLen[g + 1]);
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}