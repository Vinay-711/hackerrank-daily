import java.io.*;
import java.util.*;

class Result {
    private static int total = 0;

    public static int findConnectedComponents(List<Long> d) {
        total = 0;
        List<Long> valid = new ArrayList<>();
        int zeroOrOne = 0;
        for (long val : d) {
            if (Long.bitCount(val) >= 2) {
                valid.add(val);
            } else {
                zeroOrOne++;
            }
        }

        dfs(0, valid, new ArrayList<>());
        // For each zeroOrOne element, each choice of subsets doubles the count
        return total * (1 << zeroOrOne);
    }

    private static void dfs(int idx, List<Long> valid, List<Long> comps) {
        if (idx == valid.size()) {
            long covered = 0L;
            for (long m : comps) covered |= m;
            int count = (64 - Long.bitCount(covered)) + comps.size();
            total += count;
            return;
        }

        // Branch 1: Exclude valid.get(idx)
        dfs(idx + 1, valid, comps);

        // Branch 2: Include valid.get(idx)
        long val = valid.get(idx);
        long merged = val;
        List<Long> nextComps = new ArrayList<>();
        for (long c : comps) {
            if ((c & val) != 0L) {
                merged |= c;
            } else {
                nextComps.add(c);
            }
        }
        nextComps.add(merged);
        dfs(idx + 1, valid, nextComps);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int dCount = Integer.parseInt(line.trim());

        String[] parts = br.readLine().trim().split("\\s+");
        List<Long> d = new ArrayList<>();
        for (int i = 0; i < dCount; i++) {
            d.add(Long.parseUnsignedLong(parts[i]));
        }

        int ans = Result.findConnectedComponents(d);
        System.out.println(ans);
        br.close();
    }
}
