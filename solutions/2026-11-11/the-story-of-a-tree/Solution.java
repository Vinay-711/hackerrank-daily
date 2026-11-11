import java.io.*;
import java.util.*;

class Result {
    public static String storyOfATree(int n, List<List<Integer>> edges, int k, List<List<Integer>> guesses) {
        List<List<Integer>> adj = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
        for (List<Integer> edge : edges) {
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        Map<Integer, Set<Integer>> guessMap = new HashMap<>();
        for (List<Integer> g : guesses) {
            guessMap.computeIfAbsent(g.get(0), x -> new HashSet<Integer>()).add(g.get(1));
        }
        int[] count = new int[n + 1];
        int initialScore = dfs1(1, 0, adj, guessMap, count);
        int[] finalScores = new int[n + 1];
        dfs2(1, 0, initialScore, adj, guessMap, finalScores);
        int wins = 0;
        for (int i = 1; i <= n; i++) {
            if (finalScores[i] >= k) wins++;
        }
        int common = gcd(wins, n);
        return (wins / common) + "/" + (n / common);
    }

    private static int dfs1(int u, int p, List<List<Integer>> adj, Map<Integer, Set<Integer>> guessMap, int[] count) {
        int score = 0;
        for (int v : adj.get(u)) {
            if (v != p) {
                if (guessMap.containsKey(u) && guessMap.get(u).contains(v)) score++;
                score += dfs1(v, u, adj, guessMap, count);
            }
        }
        return score;
    }

    private static void dfs2(int u, int p, int currentScore, List<List<Integer>> adj, Map<Integer, Set<Integer>> guessMap, int[] finalScores) {
        finalScores[u] = currentScore;
        for (int v : adj.get(u)) {
            if (v != p) {
                int nextScore = currentScore;
                if (guessMap.containsKey(u) && guessMap.get(u).contains(v)) nextScore--;
                if (guessMap.containsKey(v) && guessMap.get(v).contains(u)) nextScore++;
                dfs2(v, u, nextScore, adj, guessMap, finalScores);
            }
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int q = Integer.parseInt(line.trim());
        while (q-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            List<List<Integer>> edges = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                String[] parts = br.readLine().split(" ");
                edges.add(Arrays.asList(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])));
            }
            String[] gk = br.readLine().split(" ");
            int gCount = Integer.parseInt(gk[0]);
            int k = Integer.parseInt(gk[1]);
            List<List<Integer>> guesses = new ArrayList<>();
            for (int i = 0; i < gCount; i++) {
                String[] parts = br.readLine().split(" ");
                guesses.add(Arrays.asList(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])));
            }
            System.out.println(Result.storyOfATree(n, edges, k, guesses));
        }
    }
}