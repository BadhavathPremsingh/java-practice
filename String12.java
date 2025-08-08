import java.io.*;
import java.util.*;
class String12
{
  public static void main(String[] args)
  {
    String s1="Hello?";
    char s2=s1.charAt(1);
    System.out.println(s2);
    System.out.println(s1.codePointAt(5));
    System.out.println(s1.codePointBefore(2));
    System.out.println(s1.codePointCount(1,5));
    String s3="hello?";
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareToIgnoreCase(s3));
    System.out.println(s1.contains("a"));
    System.out.println(s1.contentEquals("Hello?"));
    char sarr[]={'h','e','l','l','o'};
    String s4=" ";
    System.out.println(s4.copyValueOf(sarr,0,3));
    System.out.println(s3.endsWith("?"));
  }
}