import java.io.*;
import java.util.*;
class String8
{
 public static void main(String[] args)
 {
  String s1="Hi Hello";
  String s2="";
  String sarr[]=s1.split(" ");
  for(int i=0;i<sarr.length;i++)
  {
   s2=sarr[i]+" "+s2;
   }
   System.out.println(s2);
  }
}