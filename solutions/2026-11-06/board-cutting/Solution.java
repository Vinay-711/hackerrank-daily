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
    private static final long MOD = 1_000_000_007L;

    public static int boardCutting(List<Integer> cost_y, List<Integer> cost_x) {
        cost_y.sort(Collections.reverseOrder());
        cost_x.sort(Collections.reverseOrder());

        int i = 0, j = 0;
        long hSegments = 1;
        long vSegments = 1;
        long totalCost = 0;

        while (i < cost_y.size() && j < cost_x.size()) {
            if (cost_y.get(i) >= cost_x.get(j)) {
                totalCost = (totalCost + (long) cost_y.get(i) * vSegments) % MOD;
                hSegments++;
                i++;
            } else {
                totalCost = (totalCost + (long) cost_x.get(j) * hSegments) % MOD;
                vSegments++;
                j++;
            }
        }

        while (i < cost_y.size()) {
            totalCost = (totalCost + (long) cost_y.get(i) * vSegments) % MOD;
            hSegments++;
            i++;
        }

        while (j < cost_x.size()) {
            totalCost = (totalCost + (long) cost_x.get(j) * hSegments) % MOD;
            vSegments++;
            j++;
        }

        return (int) (totalCost % MOD);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = (outputPath != null && !outputPath.isEmpty())
            ? new BufferedWriter(new FileWriter(outputPath))
            : new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int m = Integer.parseInt(firstMultipleInput[0]);
            int n = Integer.parseInt(firstMultipleInput[1]);

            List<Integer> cost_y = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

            List<Integer> cost_x = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

            int result = Result.boardCutting(cost_y, cost_x);
            bufferedWriter.write(String.valueOf(result) + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
