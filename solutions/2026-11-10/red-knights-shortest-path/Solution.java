import java.io.*;
import java.util.*;

class Result {
    static class Node {
        int r, c;
        Node(int r, int c) { this.r = r; this.c = c; }
    }

    public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        int[] dr = {-2, -2, 0, 2, 2, 0};
        int[] dc = {-1, 1, 2, 1, -1, -2};
        String[] names = {"UL", "UR", "R", "LR", "LL", "L"};

        Node[][] parent = new Node[n][n];
        String[][] moveName = new String[n][n];
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(dist[i], -1);

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i_start, j_start));
        dist[i_start][j_start] = 0;

        boolean found = false;
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.r == i_end && curr.c == j_end) {
                found = true;
                break;
            }
            for (int i = 0; i < 6; i++) {
                int nr = curr.r + dr[i];
                int nc = curr.c + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[curr.r][curr.c] + 1;
                    parent[nr][nc] = curr;
                    moveName[nr][nc] = names[i];
                    q.add(new Node(nr, nc));
                }
            }
        }

        if (!found) {
            System.out.println("Impossible");
        } else {
            System.out.println(dist[i_end][j_end]);
            List<String> path = new ArrayList<>();
            Node curr = new Node(i_end, j_end);
            while (curr.r != i_start || curr.c != j_start) {
                path.add(moveName[curr.r][curr.c]);
                curr = parent[curr.r][curr.c];
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i)).append(i == path.size() - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int i_start = Integer.parseInt(firstMultipleInput[0]);
        int j_start = Integer.parseInt(firstMultipleInput[1]);
        int i_end = Integer.parseInt(firstMultipleInput[2]);
        int j_end = Integer.parseInt(firstMultipleInput[3]);
        Result.printShortestPath(n, i_start, j_start, i_end, j_end);
        bufferedReader.close();
    }
}