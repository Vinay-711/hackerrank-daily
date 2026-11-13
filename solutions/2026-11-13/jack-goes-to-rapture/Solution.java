import java.io.*;
import java.util.*;

class Result {
    static class NodeCost implements Comparable<NodeCost> {
        int node;
        long cost;

        public NodeCost(int node, long cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(NodeCost o) {
            return Long.compare(this.cost, o.cost);
        }
    }

    public static void getCost(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        List<List<int[]>> adj = new ArrayList<List<int[]>>();
        for (int i = 0; i <= gNodes; i++) {
            adj.add(new ArrayList<int[]>());
        }

        int edgesCount = gFrom.size();
        for (int i = 0; i < edgesCount; i++) {
            int u = gFrom.get(i);
            int v = gTo.get(i);
            int w = gWeight.get(i);
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        long[] dist = new long[gNodes + 1];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<NodeCost> pq = new PriorityQueue<NodeCost>();
        dist[1] = 0;
        pq.add(new NodeCost(1, 0));

        while (!pq.isEmpty()) {
            NodeCost curr = pq.poll();
            int u = curr.node;
            long d = curr.cost;

            if (d > dist[u]) {
                continue;
            }

            if (u == gNodes) {
                break;
            }

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int w = edge[1];
                long newCost = Math.max(d, (long) w);
                if (newCost < dist[v]) {
                    dist[v] = newCost;
                    pq.add(new NodeCost(v, newCost));
                }
            }
        }

        if (dist[gNodes] == Long.MAX_VALUE) {
            System.out.println("NO PATH EXISTS");
        } else {
            System.out.println(dist[gNodes]);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line == null) return;
        String[] gNodesEdges = line.trim().split("\\s+");

        int gNodes = Integer.parseInt(gNodesEdges[0]);
        int gEdges = Integer.parseInt(gNodesEdges[1]);

        List<Integer> gFrom = new ArrayList<Integer>();
        List<Integer> gTo = new ArrayList<Integer>();
        List<Integer> gWeight = new ArrayList<Integer>();

        for (int i = 0; i < gEdges; i++) {
            String[] gFromToWeight = bufferedReader.readLine().trim().split("\\s+");
            gFrom.add(Integer.parseInt(gFromToWeight[0]));
            gTo.add(Integer.parseInt(gFromToWeight[1]));
            gWeight.add(Integer.parseInt(gFromToWeight[2]));
        }

        Result.getCost(gNodes, gFrom, gTo, gWeight);
        bufferedReader.close();
    }
}