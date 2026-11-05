import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int max_up = n - r_q;
        int max_down = r_q - 1;
        int max_right = n - c_q;
        int max_left = c_q - 1;

        int max_up_right = Math.min(n - r_q, n - c_q);
        int max_up_left = Math.min(n - r_q, c_q - 1);
        int max_down_right = Math.min(r_q - 1, n - c_q);
        int max_down_left = Math.min(r_q - 1, c_q - 1);

        for (List<Integer> obstacle : obstacles) {
            int r_o = obstacle.get(0);
            int c_o = obstacle.get(1);

            if (c_o == c_q) {
                if (r_o > r_q) {
                    max_up = Math.min(max_up, r_o - r_q - 1);
                } else {
                    max_down = Math.min(max_down, r_q - r_o - 1);
                }
            } else if (r_o == r_q) {
                if (c_o > c_q) {
                    max_right = Math.min(max_right, c_o - c_q - 1);
                } else {
                    max_left = Math.min(max_left, c_q - c_o - 1);
                }
            } else if (r_o - r_q == c_o - c_q) {
                if (r_o > r_q) {
                    max_up_right = Math.min(max_up_right, r_o - r_q - 1);
                } else {
                    max_down_left = Math.min(max_down_left, r_q - r_o - 1);
                }
            } else if (r_o - r_q == -(c_o - c_q)) {
                if (r_o > r_q) {
                    max_up_left = Math.min(max_up_left, r_o - r_q - 1);
                } else {
                    max_down_right = Math.min(max_down_right, r_q - r_o - 1);
                }
            }
        }

        return max_up + max_down + max_right + max_left + 
               max_up_right + max_up_left + max_down_right + max_down_left;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH") != null ? System.getenv("OUTPUT_PATH") : "/dev/stdout"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);
        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}