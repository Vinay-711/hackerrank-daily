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

 public static void main(String[] args)throws Exception{Fast in=new Fast();int n=in.nextInt(),k=in.nextInt();long[] a=new long[n],prefix=new long[n+1];for(int i=0;i<n;i++)a[i]=in.nextLong();Arrays.sort(a);for(int i=0;i<n;i++)prefix[i+1]=prefix[i]+a[i];long cost=0;for(int i=0;i<k;i++)cost+=(2L*i-k+1)*a[i];long best=cost;for(int left=0;left+k<n;left++){long remaining=prefix[left+k]-prefix[left+1];cost+=(k-1L)*(a[left]+a[left+k])-2*remaining;best=Math.min(best,cost);}System.out.println(best);}}
