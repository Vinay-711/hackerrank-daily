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
int n=in.nextInt();int[] value=new int[n],day=new int[n];int top=-1,best=0;for(int i=0;i<n;i++){int x=in.nextInt(),death=0;while(top>=0&&x<=value[top])death=Math.max(death,day[top--]);death=top<0?0:death+1;value[++top]=x;day[top]=death;best=Math.max(best,death);}out.append(best).append('\n');
System.out.print(out);}
}