import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static String counterGame(long n) {
        int moves = 0;
        while (n > 1) {
            if ((n & (n - 1)) == 0) {
                n >>= 1;
            } else {
                long hp = Long.highestOneBit(n);
                n -= hp;
            }
            moves++;
        }
        return (moves % 2 == 1) ? "Louise" : "Richard";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());
            String result = Result.counterGame(n);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}