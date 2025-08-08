import java.io.*;
import java.util.*;
class Static1
{
 static String school="pw";
  static int a;
 static
 {
  a=1;
 }
 System.out.println(a);
 public static void display()
 {
  System.out.println("in the display method");
 }
static class NestedStatic1
{
  System.out.println("in the nested static class");
}
}
public class Exe16
{
 public static void main(String[] args)
 {
  System.out.println("In the main method");
  System.out.println(school);
}
}
  