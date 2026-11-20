import java.io.*;
import java.util.*;

class Result {
    public static int superDigit(String n, int k) {
        long digitSum = 0L;
        for (int i = 0; i < n.length(); i++) {
            digitSum += n.charAt(i) - '0';
        }
        long cur = digitSum * k;
        while (cur >= 10) {
            long next = 0L;
            while (cur > 0) {
                next += cur % 10;
                cur /= 10;
            }
            cur = next;
        }
        return (int) cur;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
        String n = firstMultipleInput[0];
        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}