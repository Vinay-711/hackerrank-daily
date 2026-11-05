import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int n = ranked.size();
        int[] unique = new int[n];
        int k = 0;
        for (int score : ranked) {
            if (k == 0 || unique[k - 1] != score) {
                unique[k++] = score;
            }
        }

        List<Integer> result = new ArrayList<>(player.size());
        int index = k - 1;

        for (int p : player) {
            while (index >= 0 && p >= unique[index]) {
                index--;
            }
            result.add(index + 2);
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(