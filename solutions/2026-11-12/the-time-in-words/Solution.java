import java.io.*;
import java.util.*;

class Result {
    public static String timeInWords(int h, int m) {
        String[] nums = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
        };

        if (m == 0) {
            return nums[h] + " o' clock";
        } else if (m == 15) {
            return "quarter past " + nums[h];
        } else if (m == 30) {
            return "half past " + nums[h];
        } else if (m == 45) {
            return "quarter to " + nums[h % 12 + 1];
        } else if (m < 30) {
            String minStr = (m == 1) ? "minute" : "minutes";
            return nums[m] + " " + minStr + " past " + nums[h];
        } else {
            int remaining = 60 - m;
            String minStr = (remaining == 1) ? "minute" : "minutes";
            return nums[remaining] + " " + minStr + " to " + nums[h % 12 + 1];
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = new BufferedWriter(outputPath != null ? new FileWriter(outputPath) : new OutputStreamWriter(System.out));

        int h = Integer.parseInt(bufferedReader.readLine().trim());
        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}