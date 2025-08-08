import java.io.*;
import java.util.*;
class String9
{
 public static void main(String[] args)
 {
   String s1="School Master";
   String s2="The Classroom";
   s1=s1.toLowerCase();
   s2=s2.toLowerCase();
   s1=s1.replace(" ","");
   s2=s2.replace(" ","");
   char ch1[]=s1.toCharArray();
   char ch2[]=s2.toCharArray();
   Arrays.sort(ch1);
   Arrays.sort(ch2);
   if(Arrays.equals(ch1,ch2))
   {
    System.out.println("It a Anagram");
   }
   else
   {
    System.out.println("Not a Anagram");
   }
  }
}
   
   