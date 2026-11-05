import java.io.*;
import java.util.*;

public class Solution {
    private static final int INF = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        String[] roadNodesEdges = line.trim().split("\\s+");

        int n = Integer.parseInt(roadNodesEdges[0]);
        int m = Integer.parseInt(roadNodesEdges[1]);

        int[][] dist = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            String[] edge = br.readLine().trim().split("\\s+");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            int w = Integer.parseInt(edge[2]);
            // The problem states: the last one (most recent) is to be considered as the only edge
            dist[u][v] = w;
        }

        // Distance from node to itself is always 0
        for (int i = 1; i <= n; i++) {
            dist[i][i] = 0;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                if (dist[i][k] == INF) continue;
                for (int j = 1; j <= n; j++) {
                    if (dist[k][j] == INF) continue;
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        String qStr = br.readLine();
        if (qStr == null) return;
        int q = Integer.parseInt(qStr.trim());

        StringBuilder sb = new StringBuilder();
        for (int qItr = 0; qItr < q; qItr++) {
            String[] query = br.readLine().trim().split("\\s+");
            int x = Integer.parseInt(query[0]);
            int y = Integer.parseInt(query[1]);

            if (x == y) {
                sb.append("0\n");
            } else if (dist[x][y] == INF) {
                sb.append("-1\n");
            } else {
                sb.append(dist[x][y]).append("\n");
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}
