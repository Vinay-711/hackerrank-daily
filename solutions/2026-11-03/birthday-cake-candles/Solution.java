import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);int n=in.nextInt(),max=0,count=0;
for(int i=0;i<n;i++){int x=in.nextInt();if(x>max){max=x;count=1;}else if(x==max)count++;}System.out.println(count);
 }
}
