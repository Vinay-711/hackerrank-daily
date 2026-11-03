import java.io.*;
import java.util.*;
public class Solution {

 static class Fast {
  byte[] buffer=new byte[65536];int at=0,size=0;
  int read()throws Exception{if(at==size){size=System.in.read(buffer);at=0;if(size<0)return -1;}return buffer[at++];}
  String next()throws Exception{StringBuilder s=new StringBuilder();int c;do{c=read();}while(c<=32&&c!=-1);while(c>32){s.append((char)c);c=read();}return s.toString();}
  long nextLong()throws Exception{return Long.parseLong(next());}
  int nextInt()throws Exception{return Integer.parseInt(next());}
 }

 public static void main(String[] args)throws Exception{Fast in=new Fast();StringBuilder out=new StringBuilder();
int t=in.nextInt();while(t-->0){int n=in.nextInt();long m=in.nextLong(),prefix=0,best=0;TreeSet<Long> seen=new TreeSet<>();seen.add(0L);for(int i=0;i<n;i++){long value=in.nextLong()%m;prefix=prefix>=m-value?prefix-(m-value):prefix+value;best=Math.max(best,prefix);Long higher=seen.higher(prefix);if(higher!=null)best=Math.max(best,m-(higher-prefix));seen.add(prefix);}out.append(best).append('\n');}
System.out.print(out);}
}