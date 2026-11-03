import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);String s=in.next();int h=Integer.parseInt(s.substring(0,2))%12;
if(s.endsWith("PM"))h+=12;System.out.printf("%02d%s%n",h,s.substring(2,8));
 }
}
