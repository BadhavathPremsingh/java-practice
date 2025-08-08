import java.io.*;
import java.util.*;
class String10
{
 public static void main(String[] args)
 {
  String s1="Abcdefghijklmnopqrstuvwxyz";
  s1=s1.toUpperCase();
  boolean flag=false;
  char ch1[]=s1.toCharArray();
  char ch2[]=new char[26];
  for(int i=0;i<ch1.length;i++)
  {
   int a=ch1[i]-65;
   ch2[a]++;
  }
  for(int i=0;i<ch2.length;i++)
  {
   if(ch2[i]==0)
   {
    System.out.println("Not a pangram");
   flag=true;
   }
  }
   if(flag==true);
    {
     System.out.println("It is a pangram");
    }
  
 }
}
  
  