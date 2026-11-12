import java.io.*;
import java.util.*;

class Result {
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int up = n - r_q;
        int down = r_q - 1;
        int left = c_q - 1;
        int right = n - c_q;
        int upLeft = Math.min(up, left);
        int upRight = Math.min(up, right);
        int downLeft = Math.min(down, left);
        int downRight = Math.min(down, right);

        for (List<Integer> obs : obstacles) {
            int r = obs.get(0);
            int c = obs.get(1);

            if (c == c_q) {
                if (r > r_q) up = Math.min(up, r - r_q - 1);
                else if (r < r_q) down = Math.min(down, r_q - r - 1);
            } else if (r == r_q) {
                if (c > c_q) right = Math.min(right, c - c_q - 1);
                else if (c < c_q) left = Math.min(left, c_q - c - 1);
            } else if (Math.abs(r - r_q) == Math.abs(c - c_q)) {
                if (r > r_q && c < c_q) upLeft = Math.min(upLeft, r - r_q - 1);
                else if (r > r_q && c > c_q) upRight = Math.min(upRight, r - r_q - 1);
                else if (r < r_q && c < c_q) downLeft = Math.min(downLeft, r_q - r - 1);
                else if (r < r_q && c > c_q) downRight = Math.min(downRight, r_q - r - 1);
            }
        }
        return up + down + left + right + upLeft + upRight + downLeft + downRight;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = bufferedReader.readLine();
        if (line1 == null) return;
        String[] firstMultipleInput = line1.trim().split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);
        String[] secondMultipleInput = bufferedReader.readLine().trim().split(" ");
        int r_q = Integer.parseInt(secondMultipleInput[0]);
        int c_q = Integer.parseInt(secondMultipleInput[1]);
        List<List<Integer>> obstacles = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String[] obsInput = bufferedReader.readLine().trim().split(" ");
            List<Integer> obs = new ArrayList<>();
            obs.add(Integer.parseInt(obsInput[0]));
            obs.add(Integer.parseInt(obsInput[1]));
            obstacles.add(obs);
        }
        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);
        bufferedReader.close();
    }
}