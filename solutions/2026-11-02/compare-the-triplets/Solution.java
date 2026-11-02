// AI-assisted archived practice solution.
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); int[] a=new int[3];
        for(int i=0;i<3;i++) a[i]=in.nextInt();
        int alice=0,bob=0;
        for(int i=0;i<3;i++) {
            int b=in.nextInt();
            if(a[i]>b) alice++; else if(a[i]<b) bob++;
        }
        System.out.println(alice+" "+bob);
    }
}
