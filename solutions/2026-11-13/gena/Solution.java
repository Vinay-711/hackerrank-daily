import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hanoi' function below.
     *
     * The function is expected to return a LONG.
     * The function accepts INTEGER_ARRAY posts as parameter.
     */
    public static long hanoi(List<Integer> posts) {
        int n = posts.size();
        int startState = 0;
        for (int i = 0; i < n; i++) {
            int rod = posts.get(i) - 1;
            startState |= (rod << (2 * i));
        }

        if (startState == 0) {
            return 0;
        }

        int maxState = 1 << (2 * n);
        int[] dist = new int[maxState];
        Arrays.fill(dist, -1);

        int[] q = new int[maxState];
        int head = 0;
        int tail = 0;

        dist[startState] = 0;
        q[tail++] = startState;

        int[] top = new int[4];

        while (head < tail) {
            int u = q[head++];
            int d = dist[u];

            top[0] = -1;
            top[1] = -1;
            top[2] = -1;
            top[3] = -1;

            for (int i = 0; i < n; i++) {
                int rod = (u >> (2 * i)) & 3;
                if (top[rod] == -1) {
                    top[rod] = i;
                }
            }

            for (int r1 = 0; r1 < 4; r1++) {
                if (top[r1] == -1) continue;
                int disk = top[r1];

                for (int r2 = 0; r2 < 4; r2++) {
                    if (r1 == r2) continue;
                    if (top[r2] == -1 || top[r2] > disk) {
                        int v = (u & ~(3 << (2 * disk))) | (r2 << (2 * disk));
                        if (v == 0) {
                            return d + 1;
                        }
                        if (dist[v] == -1) {
                            dist[v] = d + 1;
                            q[tail++] = v;
                        }
                    }
                }
            }
        }

        return -1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line1 = bufferedReader.readLine();
        if (line1 == null) {
            return;
        }
        int n = Integer.parseInt(line1.trim());

        String line2 = bufferedReader.readLine();
        if (line2 == null) {
            return;
        }
        List<Integer> loc = Stream.of(line2.trim().split("\\s+"))
            .map(Integer::parseInt)
            .collect(toList());

        long res = Result.hanoi(loc);

        System.out.println(res);

        bufferedReader.close();
    }
}