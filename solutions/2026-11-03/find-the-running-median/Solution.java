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
int n=in.nextInt();PriorityQueue<Integer> low=new PriorityQueue<>(Collections.reverseOrder()),high=new PriorityQueue<>();for(int i=0;i<n;i++){int x=in.nextInt();if(low.isEmpty()||x<=low.peek())low.add(x);else high.add(x);if(low.size()>high.size()+1)high.add(low.poll());if(high.size()>low.size())low.add(high.poll());long twice=low.size()==high.size()?(long)low.peek()+high.peek():2L*low.peek();out.append(twice/2).append(twice%2==0?".0":".5").append('\n');}
System.out.print(out);}
}