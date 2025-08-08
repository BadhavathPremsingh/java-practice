import java.io.*;
import java.util.*;
class String2
{ 
  public static void main(String[] args)
 {
  String s1="Hi";
  System.out.println(s1);
  s1.concat("Hello");
  System.out.println(s1);
  String s2="HiHello";
  System.out.println(s1==s2);
  System.out.println(s1.equals(s2));
 }
}
   