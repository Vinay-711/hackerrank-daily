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
static int kth(int[] bit,int k){int at=0;for(int jump=Integer.highestOneBit(bit.length-1);jump>0;jump>>=1){int next=at+jump;if(next<bit.length&&bit[next]<k){at=next;k-=bit[next];}}return at;}
 public static void main(String[] args)throws Exception{Fast in=new Fast();StringBuilder out=new StringBuilder();
int n=in.nextInt();char[] ops=new char[n];int[] values=new int[n],sorted=new int[n];for(int i=0;i<n;i++){ops[i]=in.next().charAt(0);values[i]=sorted[i]=in.nextInt();}Arrays.sort(sorted);int unique=0;for(int v:sorted)if(unique==0||sorted[unique-1]!=v)sorted[unique++]=v;int[] bit=new int[unique+1],frequency=new int[unique];int size=0;for(int i=0;i<n;i++){int rank=Arrays.binarySearch(sorted,0,unique,values[i]);if(ops[i]=='r'&&frequency[rank]==0){out.append("Wrong!\n");continue;}int delta=ops[i]=='a'?1:-1;frequency[rank]+=delta;size+=delta;for(int j=rank+1;j<bit.length;j+=j&-j)bit[j]+=delta;if(size==0){out.append("Wrong!\n");continue;}long total=(long)sorted[kth(bit,(size+1)/2)]+sorted[kth(bit,size/2+1)];if(total%2==0)out.append(total/2);else{if(total<0)out.append('-');out.append(Math.abs(total)/2).append(".5");}out.append('\n');}
System.out.print(out);}
}