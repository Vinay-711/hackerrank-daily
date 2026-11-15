import java.io.*;
import java.util.*;

public class Solution {

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int n = c.length;
        int totalCost = 0;
        int flowersBought = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            int multiplier = (flowersBought / k) + 1;
            totalCost += multiplier * c[i];
            flowersBought++;
        }
        return totalCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String envPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = null;
        if (envPath != null) {
            bufferedWriter = new BufferedWriter(new FileWriter(envPath));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];
        String[] cItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(cItems[i]);
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}