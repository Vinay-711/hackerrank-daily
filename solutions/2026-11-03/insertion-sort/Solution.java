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
static long count(int[] a,int[] tmp,int l,int r){if(r-l<=1)return 0;int m=(l+r)/2;long ans=count(a,tmp,l,m)+count(a,tmp,m,r);int i=l,j=m,k=l;while(i<m||j<r){if(j==r||(i<m&&a[i]<=a[j]))tmp[k++]=a[i++];else{tmp[k++]=a[j++];ans+=m-i;}}System.arraycopy(tmp,l,a,l,r-l);return ans;}
 public static void main(String[] args)throws Exception{Fast in=new Fast();StringBuilder out=new StringBuilder();
int t=in.nextInt();while(t-->0){int n=in.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=in.nextInt();out.append(count(a,new int[n],0,n)).append('\n');}
System.out.print(out);}
}