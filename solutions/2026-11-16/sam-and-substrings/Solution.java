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

    public static int substrings(String n) {
        long MOD = 1000000007;
        long totalSum = 0;
        long currentSum = 0;
        
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            currentSum = (currentSum * 10 + (long)(i + 1) * digit) % MOD;
            totalSum = (totalSum + currentSum) % MOD;
        }
        
        return (int) totalSum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = new BufferedWriter(output != null ? new FileWriter(output) : new OutputStreamWriter(System.out));

        String n = bufferedReader.readLine();

        int result = Result.substrings(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}