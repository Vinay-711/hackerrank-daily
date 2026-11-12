import java.io.*;
import java.util.*;

class Result {
    public static int steadyGene(String gene) {
        int n = gene.length();
        int target = n / 4;
        int[] counts = new int[256];
        for (int i = 0; i < n; i++) {
            counts[gene.charAt(i)]++;
        }

        if (counts['A'] == target && counts['C'] == target && counts['G'] == target && counts['T'] == target) {
            return 0;
        }

        int minLen = n;
        int left = 0;
        for (int right = 0; right < n; right++) {
            counts[gene.charAt(right)]--;
            while (left <= right && counts['A'] <= target && counts['C'] <= target && counts['G'] <= target && counts['T'] <= target) {
                minLen = Math.min(minLen, right - left + 1);
                counts[gene.charAt(left)]++;
                left++;
            }
        }
        return minLen;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = bufferedReader.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());
        String gene = bufferedReader.readLine();

        int result = Result.steadyGene(gene);

        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath != null) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } else {
            System.out.println(result);
        }
        bufferedReader.close();
    }
}