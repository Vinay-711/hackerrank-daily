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
static long prefix(long[][][] b,int x,int y,int z){long s=0;for(int i=x;i>0;i-=i&-i)for(int j=y;j>0;j-=j&-j)for(int k=z;k>0;k-=k&-k)s+=b[i][j][k];return s;}
 public static void main(String[] args)throws Exception{Fast in=new Fast();StringBuilder out=new StringBuilder();
int t=in.nextInt();while(t-->0){int n=in.nextInt(),m=in.nextInt();long[][][] bit=new long[n+1][n+1][n+1],value=new long[n+1][n+1][n+1];while(m-->0){String op=in.next();if(op.equals("UPDATE")){int x=in.nextInt(),y=in.nextInt(),z=in.nextInt();long v=in.nextLong(),delta=v-value[x][y][z];value[x][y][z]=v;for(int i=x;i<=n;i+=i&-i)for(int j=y;j<=n;j+=j&-j)for(int k=z;k<=n;k+=k&-k)bit[i][j][k]+=delta;}else{int[] lo={in.nextInt()-1,in.nextInt()-1,in.nextInt()-1},hi={in.nextInt(),in.nextInt(),in.nextInt()};long answer=0;for(int mask=0;mask<8;mask++){int x=(mask&1)==0?hi[0]:lo[0],y=(mask&2)==0?hi[1]:lo[1],z=(mask&4)==0?hi[2]:lo[2];long v=prefix(bit,x,y,z);answer+=Integer.bitCount(mask)%2==0?v:-v;}out.append(answer).append('\n');}}}
System.out.print(out);}
}