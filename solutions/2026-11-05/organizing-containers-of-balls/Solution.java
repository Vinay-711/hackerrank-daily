import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            long[] containerCapacities = new long[n];
            long[] ballTypeCounts = new long[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    long val = sc.nextLong();
                    containerCapacities[i] += val;
                    ballTypeCounts[j] += val;
                }
            }
            Arrays.sort(containerCapacities);
            Arrays.sort(ballTypeCounts);
            if (Arrays.equals(containerCapacities, ballTypeCounts)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
        sc.close();
    }
}