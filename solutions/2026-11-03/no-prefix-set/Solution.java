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
int n=in.nextInt();TreeSet<String> set=new TreeSet<>();String bad=null;for(int i=0;i<n;i++){String word=in.next();if(bad!=null)continue;String before=set.floor(word),after=set.ceiling(word);if((before!=null&&word.startsWith(before))||(after!=null&&after.startsWith(word)))bad=word;else set.add(word);}if(bad==null)out.append("GOOD SET\n");else out.append("BAD SET\n").append(bad).append('\n');
System.out.print(out);}
}