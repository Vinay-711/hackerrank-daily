import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static long theGreatXor(long x) {
        long result = 0L;
        long bit = 1L;
        while (bit < x) {
            if ((x & bit) == 0L) {
                result += bit;
            }
            bit <<= 1;
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < q; i++) {
            long x = Long.parseLong(bufferedReader.readLine().trim());
            long result = Result.theGreatXor(x);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}