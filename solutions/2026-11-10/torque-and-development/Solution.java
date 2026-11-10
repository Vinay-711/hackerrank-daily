import java.io.*;
import java.util.*;

class Result {
    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
        if (c_lib <= c_road) {
            return (long) n * c_lib;
        }
        List<List<Integer>> adj = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (List<Integer> edge : cities) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n + 1];
        long totalCost = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                int componentSize = dfs(i, adj, visited);
                totalCost += (long) c_lib + (long) (componentSize - 1) * c_road;
            }
        }
        return totalCost;
    }

    private static int dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        visited[u] = true;
        int count = 1;
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                count += dfs(v, adj, visited);
            }
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line == null) return;
        int q = Integer.parseInt(line.trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int n = Integer.parseInt(firstMultipleInput[0]);
            int m = Integer.parseInt(firstMultipleInput[1]);
            int c_lib = Integer.parseInt(firstMultipleInput[2]);
            int c_road = Integer.parseInt(firstMultipleInput[3]);

            List<List<Integer>> cities = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                String[] citiesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                List<Integer> citiesRowItems = new ArrayList<>();
                citiesRowItems.add(Integer.parseInt(citiesRowTempItems[0]));
                citiesRowItems.add(Integer.parseInt(citiesRowTempItems[1]));
                cities.add(citiesRowItems);
            }

            long result = Result.roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(result);
        }
        bufferedReader.close();
    }
}