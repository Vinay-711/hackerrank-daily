import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in); long sum=0,min=Long.MAX_VALUE,max=Long.MIN_VALUE;
for(int i=0;i<5;i++){long x=in.nextLong();sum+=x;min=Math.min(min,x);max=Math.max(max,x);}
System.out.println((sum-max)+" "+(sum-min));
 }
}
