import java.io.*;
import java.util.*;

class Result {
    public static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        int n = chars.length;
        int i = n - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }
        if (i < 0) {
            return "no answer";
        }
        int j = n - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String output = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = output != null ? new BufferedWriter(new FileWriter(output)) : new BufferedWriter(new OutputStreamWriter(System.out));

        String line = bufferedReader.readLine();
        if (line != null) {
            int T = Integer.parseInt(line.trim());
            for (int t = 0; t < T; t++) {
                String w = bufferedReader.readLine();
                String result = Result.biggerIsGreater(w);
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}