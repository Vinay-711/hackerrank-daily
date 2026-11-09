import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<List<Integer>> knightlOnAChessboard(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int a = 1; a < n; a++) {
            List<Integer> row = new ArrayList<>();
            for (int b = 1; b < n; b++) {
                row.add(bfs(n, a, b));
            }
            result.add(row);
        }
        return result;
    }

    private static int bfs(int n, int a, int b) {
        int[][] dist = new int[n][n];
        for (int[] row : dist) Arrays.fill(row, -1);
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        dist[0][0] = 0;
        int[] dx = {a, a, -a, -a, b, b, -b, -b};
        int[] dy = {b, -b, b, -b, a, -a, a, -a};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (curr[0] == n - 1 && curr[1] == n - 1) return dist[curr[0]][curr[1]];
            for (int i = 0; i < 8; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[curr[0]][curr[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> result = Result.knightlOnAChessboard(n);
        result.stream()
            .map(r -> r.stream().map(Object::toString).collect(Collectors.joining(" ")))
            .forEach(r -> {
                try {
                    bufferedWriter.write(r + "\n");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
        bufferedReader.close();
        bufferedWriter.close();
    }
}