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
    static class Node implements Comparable<Node> {
        int u;
        int dist;
        Node(int u, int dist) {
            this.u = u;
            this.dist = dist;
        }
        public int compareTo(Node o) {
            return Integer.compare(this.dist, o.dist);
        }
    }

    public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
        // Map to keep ONLY minimum weight between any u and v
        Map<Integer, Integer>[] adj = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) adj[i] = new HashMap<>();

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);
            adj[u].put(v, Math.min(adj[u].getOrDefault(v, Integer.MAX_VALUE), w));
            adj[v].put(u, Math.min(adj[v].getOrDefault(u, Integer.MAX_VALUE), w));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[s] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(s, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            if (curr.dist > dist[curr.u]) continue;

            for (Map.Entry<Integer, Integer> entry : adj[curr.u].entrySet()) {
                int to = entry.getKey();
                int weight = entry.getValue();
                int newDist = dist[curr.u] + weight;
                if (dist[to] == -1 || newDist < dist[to]) {
                    dist[to] = newDist;
                    pq.add(new Node(to, newDist));
                }
            }
        }

        List<Integer> ans = new ArrayList<>(n - 1);
        for (int i = 1; i <= n; i++) {
            if (i == s) continue;
            ans.add(dist[i]);
        }
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = (outputPath != null && !outputPath.isEmpty())
            ? new BufferedWriter(new FileWriter(outputPath))
            : new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(firstMultipleInput[0]);
            int m = Integer.parseInt(firstMultipleInput[1]);

            List<List<Integer>> edges = new ArrayList<>(m);
            for (int i = 0; i < m; i++) {
                String[] parts = bufferedReader.readLine().trim().split("\\s+");
                List<Integer> edge = new ArrayList<>(3);
                edge.add(Integer.parseInt(parts[0]));
                edge.add(Integer.parseInt(parts[1]));
                edge.add(Integer.parseInt(parts[2]));
                edges.add(edge);
            }

            int s = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> result = Result.shortestReach(n, edges, s);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i));
                if (i < result.size() - 1) sb.append(" ");
            }
            bufferedWriter.write(sb.toString() + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
