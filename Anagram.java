import java.util.*;
class Anagram
{
 public static void main(String[] args)
 {
  String a="School Master";
  String b="The Classroom";
  a=a.toLowerCase();
  b=b.toLowerCase();
  a=a.replace(" ","");
  b=b.replace(" ","");
  char arr[]=a.toCharArray();
  char barr[]=b.toCharArray();
  Arrays.sort(arr);
  System.out.println(arr);
  Arrays.sort(barr);
  System.out.println(barr);
  if(Arrays.equals(arr,barr))
  {
   System.out.println("It's a Anagram");
  }
  else
  {
   System.out.println("Not a Anagram");
  }
 }
}