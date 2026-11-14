import java.io.*;
import java.util.*;

public class Solution {
    static class Edge {
        int to;
        int weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static int jeanisRoute(int[] k, int[][] roads) {
        if (k == null || k.length <= 1) return 0;
        int n = roads.length + 1;
        List<Edge>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int[] road : roads) {
            adj[road[0]].add(new Edge(road[1], road[2]));
            adj[road[1]].add(new Edge(road[0], road[2]));
        }
        boolean[] isTarget = new boolean[n + 1];
        for (int target : k) isTarget[target] = true;
        int root = k[0];
        int[] parent = new int[n + 1];
        int[] parentWeight = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        List<Integer> order = new ArrayList<>(n);
        Queue<Integer> queue = new ArrayDeque<>();
        visited[root] = true;
        queue.add(root);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            order.add(u);
            for (Edge e : adj[u]) {
                if (!visited[e.to]) {
                    visited[e.to] = true;
                    parent[e.to] = u;
                    parentWeight[e.to] = e.weight;
                    queue.add(e.to);
                }
            }
        }
        int[] targetCount = new int[n + 1];
        for (int i = order.size() - 1; i >= 0; i--) {
            int u = order.get(i);
            if (isTarget[u]) targetCount[u]++;
            if (u != root) targetCount[parent[u]] += targetCount[u];
        }
        List<Edge>[] adjT = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adjT[i] = new ArrayList<>();
        long totalWeight = 0;
        for (int u = 1; u <= n; u++) {
            if (u != root && targetCount[u] > 0) {
                int p = parent[u];
                int w = parentWeight[u];
                totalWeight += w;
                adjT[u].add(new Edge(p, w));
                adjT[p].add(new Edge(u, w));
            }
        }
        long[] dist = bfs(root, n, adjT);
        int farNode = 1;
        for (int i = 1; i <= n; i++) if (dist[i] > dist[farNode]) farNode = i;
        dist = bfs(farNode, n, adjT);
        long diameter = 0;
        for (int i = 1; i <= n; i++) if (dist[i] > diameter) diameter = dist[i];
        return (int) (2 * totalWeight - diameter);
    }

    private static long[] bfs(int start, int n, List<Edge>[] adj) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        dist[start] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (Edge e : adj[u]) {
                if (dist[e.to] == -1) {
                    dist[e.to] = dist[u] + e.weight;
                    q.add(e.to);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] city = new int[k];
        String[] cityItems = br.readLine().split(" ");
        for (int i = 0; i < k; i++) city[i] = Integer.parseInt(cityItems[i]);
        int[][] roads = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            String[] row = br.readLine().split(" ");
            roads[i][0] = Integer.parseInt(row[0]);
            roads[i][1] = Integer.parseInt(row[1]);
            roads[i][2] = Integer.parseInt(row[2]);
        }
        System.out.println(jeanisRoute(city, roads));
    }
}