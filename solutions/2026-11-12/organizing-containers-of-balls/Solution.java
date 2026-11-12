import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static String organizingContainers(List<List<Integer>> container) {
        int n = container.size();
        long[] containerCapacities = new long[n];
        long[] ballTypeCounts = new long[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = container.get(i).get(j);
                containerCapacities[i] += val;
                ballTypeCounts[j] += val;
            }
        }

        Arrays.sort(containerCapacities);
        Arrays.sort(ballTypeCounts);

        for (int i = 0; i < n; i++) {
            if (containerCapacities[i] != ballTypeCounts[i]) {
                return "Impossible";
            }
        }

        return "Possible";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = bufferedReader.readLine();
        if (line == null) return;
        int q = Integer.parseInt(line.trim());

        for (int qItr = 0; qItr < q; qItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<List<Integer>> container = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] rowItems = bufferedReader.readLine().split(" ");
                List<Integer> row = new ArrayList<>();
                for (String item : rowItems) {
                    row.add(Integer.parseInt(item));
                }
                container.add(row);
            }

            String result = Result.organizingContainers(container);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}