import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static String gridSearch(List<String> G, List<String> P) {
        int R = G.size();
        int C = G.get(0).length();
        int r = P.size();
        int c = P.get(0).length();

        for (int i = 0; i <= R - r; i++) {
            String row = G.get(i);
            int colIndex = row.indexOf(P.get(0));
            while (colIndex != -1) {
                if (checkPattern(G, P, i, colIndex)) {
                    return "YES";
                }
                colIndex = row.indexOf(P.get(0), colIndex + 1);
            }
        }
        return "NO";
    }

    private static boolean checkPattern(List<String> G, List<String> P, int startRow, int startCol) {
        int r = P.size();
        int c = P.get(0).length();
        for (int i = 1; i < r; i++) {
            if (!G.get(startRow + i).substring(startCol, startCol + c).equals(P.get(i))) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = bufferedReader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int R = Integer.parseInt(firstMultipleInput[0]);
            List<String> G = new ArrayList<>();
            for (int i = 0; i < R; i++) {
                G.add(bufferedReader.readLine());
            }

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int r = Integer.parseInt(secondMultipleInput[0]);
            List<String> P = new ArrayList<>();
            for (int i = 0; i < r; i++) {
                P.add(bufferedReader.readLine());
            }

            String result = Result.gridSearch(G, P);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}