import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<String> bomberMan(int n, List<String> grid) {
        int r = grid.size();
        int c = grid.get(0).length();
        if (n <= 1) return grid;
        if (n % 2 == 0) {
            List<String> full = new ArrayList<>();
            for (int i = 0; i < r; i++) {
                char[] row = new char[c];
                Arrays.fill(row, 'O');
                full.add(new String(row));
            }
            return full;
        }
        List<String> state1 = detonate(grid, r, c);
        if (n % 4 == 3) return state1;
        return detonate(state1, r, c);
    }

    private static List<String> detonate(List<String> grid, int r, int c) {
        char[][] res = new char[r][c];
        for (int i = 0; i < r; i++) Arrays.fill(res[i], 'O');
        int[] dr = {0, 0, 0, 1, -1};
        int[] dc = {0, 1, -1, 0, 0};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid.get(i).charAt(j) == 'O') {
                    for (int k = 0; k < 5; k++) {
                        int ni = i + dr[k], nj = j + dc[k];
                        if (ni >= 0 && ni < r && nj >= 0 && nj < c) res[ni][nj] = '.';
                    }
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < r; i++) result.add(new String(res[i]));
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int r = Integer.parseInt(firstMultipleInput[0]);
        int c = Integer.parseInt(firstMultipleInput[1]);
        int n = Integer.parseInt(firstMultipleInput[2]);
        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
            try { return bufferedReader.readLine(); } catch (IOException ex) { throw new RuntimeException(ex); }
        }).collect(toList());
        List<String> result = Result.bomberMan(n, grid);
        for (String s : result) System.out.println(s);
        bufferedReader.close();
    }
}