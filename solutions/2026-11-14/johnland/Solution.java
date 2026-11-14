import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    static class Edge implements Comparable<Edge> {
        int u, v, c;
        Edge(int u, int v, int c) { this.u = u; this.v = v; this.c = c; }
        public int compareTo(Edge o) { return Integer.compare(this.c, o.c); }
    }

    static class DSU {
        int[] parent;
        DSU(int n) { parent = new int[n + 1]; for (int i = 1; i <= n; i++) parent[i] = i; }
        int find(int i) { if (parent[i] == i) return i; return parent[i] = find(parent[i]); }
        boolean union(int i, int j) {
            int rootI = find(i), rootJ = find(j);
            if (rootI != rootJ) { parent[rootI] = rootJ; return true; }
            return false;
        }
    }

    public static String roadsInHackerland(int n, List<List<Integer>> roads) {
        int m = roads.size();
        Edge[] edgeList = new Edge[m];
        for (int i = 0; i < m; i++) {
            List<Integer> r = roads.get(i);
            edgeList[i] = new Edge(r.get(0), r.get(1), r.get(2));
        }
        Arrays.sort(edgeList);
        DSU dsu = new DSU(n);
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<int[]>());
        int maxC = 0;
        for (Edge e : edgeList) {
            if (dsu.union(e.u, e.v)) {
                adj.get(e.u).add(new int[]{e.v, e.c});
                adj.get(e.v).add(new int[]{e.u, e.c});
                if (e.c > maxC) maxC = e.c;
            }
        }
        int[] order = new int[n];
        int[] parent = new int[n + 1];
        int[] edgeC = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        int head = 0, tail = 0;
        order[tail++] = 1; visited[1] = true;
        while (head < tail) {
            int u = order[head++];
            for (int[] neighbor : adj.get(u)) {
                if (!visited[neighbor[0]]) {
                    visited[neighbor[0]] = true;
                    parent[neighbor[0]] = u;
                    edgeC[neighbor[0]] = neighbor[1];
                    order[tail++] = neighbor[0];
                }
            }
        }
        int[] sz = new int[n + 1];
        Arrays.fill(sz, 1);
        long[] bits = new long[maxC + 100];
        for (int i = n - 1; i > 0; i--) {
            int u = order[i];
            int p = parent[u];
            sz[p] += sz[u];
            bits[edgeC[u]] += (long) sz[u] * (n - sz[u]);
        }
        for (int i = 0; i < bits.length - 1; i++) {
            bits[i + 1] += bits[i] / 2;
            bits[i] %= 2;
        }
        int high = bits.length - 1;
        while (high > 0 && bits[high] == 0) high--;
        StringBuilder sb = new StringBuilder();
        for (int i = high; i >= 0; i--) sb.append(bits[i]);
        return sb.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        List<List<Integer>> roads = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            List<Integer> road = new ArrayList<>();
            road.add(Integer.parseInt(line[0]));
            road.add(Integer.parseInt(line[1]));
            road.add(Integer.parseInt(line[2]));
            roads.add(road);
        }
        System.out.println(Result.roadsInHackerland(n, roads));
    }
}