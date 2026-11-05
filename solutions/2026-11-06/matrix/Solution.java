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
    static class DSU {
        int[] parent;
        int[] rank;
        boolean[] hasMachine;

        DSU(int n, Set<Integer> machineSet) {
            parent = new int[n];
            rank = new int[n];
            hasMachine = new boolean[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                hasMachine[i] = machineSet.contains(i);
            }
        }

        int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }

        boolean union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI == rootJ) return true;

            // If both roots have a machine, they cannot be connected
            if (hasMachine[rootI] && hasMachine[rootJ]) {
                return false;
            }

            if (rank[rootI] < rank[rootJ]) {
                parent[rootI] = rootJ;
                hasMachine[rootJ] = hasMachine[rootJ] || hasMachine[rootI];
            } else if (rank[rootI] > rank[rootJ]) {
                parent[rootJ] = rootI;
                hasMachine[rootI] = hasMachine[rootI] || hasMachine[rootJ];
            } else {
                parent[rootJ] = rootI;
                hasMachine[rootI] = hasMachine[rootI] || hasMachine[rootJ];
                rank[rootI]++;
            }
            return true;
        }
    }

    public static int minTime(List<List<Integer>> roads, List<Integer> machines) {
        int n = roads.size() + 1;
        Set<Integer> machineSet = new HashSet<>(machines);
        DSU dsu = new DSU(n, machineSet);

        // Sort roads by weight descending
        roads.sort((a, b) -> Integer.compare(b.get(2), a.get(2)));

        long destroyCost = 0;
        for (List<Integer> road : roads) {
            int u = road.get(0);
            int v = road.get(1);
            int w = road.get(2);

            if (!dsu.union(u, v)) {
                // Must destroy this road
                destroyCost += w;
            }
        }

        return (int) destroyCost;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = (outputPath != null && !outputPath.isEmpty())
            ? new BufferedWriter(new FileWriter(outputPath))
            : new BufferedWriter(new OutputStreamWriter(System.out));

        String line = bufferedReader.readLine();
        if (line == null) return;
        String[] firstMultipleInput = line.trim().split("\\s+");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> roads = new ArrayList<>(n - 1);
        for (int i = 0; i < n - 1; i++) {
            String[] edge = bufferedReader.readLine().trim().split("\\s+");
            List<Integer> r = new ArrayList<>(3);
            r.add(Integer.parseInt(edge[0]));
            r.add(Integer.parseInt(edge[1]));
            r.add(Integer.parseInt(edge[2]));
            roads.add(r);
        }

        List<Integer> machines = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            machines.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        int result = Result.minTime(roads, machines);
        bufferedWriter.write(String.valueOf(result) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
