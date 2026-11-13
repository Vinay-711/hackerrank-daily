import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);
        int k = Integer.parseInt(firstMultipleInput[2]);

        List<String> centers = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(Collectors.toList());

        List<List<Integer>> roads = new ArrayList<>();
        IntStream.range(0, m).forEach(i -> {
            try {
                roads.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = Result.shop(n, k, centers, roads);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();
        bufferedReader.close();
    }
}

class Result {

    static class Node implements Comparable<Node> {
        int u;
        int mask;
        int dist;

        Node(int u, int mask, int dist) {
            this.u = u;
            this.mask = mask;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.dist, o.dist);
        }
    }

    public static int shop(int n, int k, List<String> centers, List<List<Integer>> roads) {
        int[] nodeMasks = new int[n];
        for (int i = 0; i < n; i++) {
            String centerStr = centers.get(i).trim();
            if (centerStr.isEmpty()) continue;
            String[] parts = centerStr.split("\\s+");
            int count = Integer.parseInt(parts[0]);
            for (int j = 1; j <= count; j++) {
                int fish = Integer.parseInt(parts[j]) - 1;
                nodeMasks[i] |= (1 << fish);
            }
        }

        List<List<int[]>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> road : roads) {
            int u = road.get(0) - 1;
            int v = road.get(1) - 1;
            int w = road.get(2);
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        int numMasks = 1 << k;
        int[][] dist = new int[n][numMasks];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[0][nodeMasks[0]] = 0;
        pq.add(new Node(0, nodeMasks[0], 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            if (curr.dist > dist[curr.u][curr.mask]) {
                continue;
            }

            for (int[] edge : adj.get(curr.u)) {
                int v = edge[0];
                int w = edge[1];
                int nextMask = curr.mask | nodeMasks[v];
                if (dist[v][nextMask] > curr.dist + w) {
                    dist[v][nextMask] = curr.dist + w;
                    pq.add(new Node(v, nextMask, dist[v][nextMask]));
                }
            }
        }

        int minTime = Integer.MAX_VALUE;
        int dest = n - 1;
        int fullMask = numMasks - 1;

        for (int m1 = 0; m1 < numMasks; m1++) {
            if (dist[dest][m1] == Integer.MAX_VALUE) continue;
            for (int m2 = m1; m2 < numMasks; m2++) {
                if ((m1 | m2) == fullMask) {
                    if (dist[dest][m2] != Integer.MAX_VALUE) {
                        minTime = Math.min(minTime, Math.max(dist[dest][m1], dist[dest][m2]));
                    }
                }
            }
        }

        return minTime;
    }
}