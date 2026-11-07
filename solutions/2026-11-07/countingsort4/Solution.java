import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void countSort(List<List<String>> arr) {
        int n = arr.size();
        int maxVal = 0;
        for (List<String> pair : arr) {
            maxVal = Math.max(maxVal, Integer.parseInt(pair.get(0)));
        }

        List<StringBuilder>[] buckets = new ArrayList[maxVal + 1];
        for (int i = 0; i <= maxVal; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(arr.get(i).get(0));
            String s = arr.get(i).get(1);
            if (i < n / 2) {
                buckets[val].add(new StringBuilder("-"));
            } else {
                buckets[val].add(new StringBuilder(s));
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= maxVal; i++) {
            for (StringBuilder sb : buckets[i]) {
                output.append(sb).append(" ");
            }
        }
        System.out.println(output.toString().trim());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<String>> arr = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Result.countSort(arr);
        bufferedReader.close();
    }
}