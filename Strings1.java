import java.io.*;
import java.util.*;
class Strings1
{
  public static void main(String[] args)
  {
    String s1="Hello";
    System.out.println(s1);
    s1=s1.concat("Rama");
    System.out.println(s1);
    String s2="hi";
    System.out.println(s2);
    String s3="hi";
    System.out.println(s3);
    System.out.println(s2==s3);
    System.out.println(s2.equals(s3));
    String s4=new String("hi");
    System.out.println(s3==s4);
    System.out.println(s3.equals(s4));
    String s5=new String("hi");
    System.out.println(s4==s5);
    System.out.println(s4.equals(s5));
    
  }
}