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
int n=in.nextInt();long[] a=new long[n];for(int i=0;i<n;i++)a[i]=in.nextLong();long p=in.nextLong(),q=in.nextLong();Arrays.sort(a);TreeSet<Long> candidates=new TreeSet<>();candidates.add(p);candidates.add(q);for(int i=1;i<n;i++){long mid=a[i-1]+(a[i]-a[i-1])/2;candidates.add(Math.max(p,Math.min(q,mid)));candidates.add(Math.max(p,Math.min(q,mid+1)));}long best=-1,answer=p;for(long x:candidates){int at=Arrays.binarySearch(a,x);long distance;if(at>=0)distance=0;else{at=-at-1;distance=Long.MAX_VALUE;if(at<n)distance=Math.min(distance,a[at]-x);if(at>0)distance=Math.min(distance,x-a[at-1]);}if(distance>best){best=distance;answer=x;}}out.append(answer).append('\n');
System.out.print(out);}
}