import java.io.*;
import java.io.*;
class NestedIf
{
 public void test()
 {
  int a=20;
  if(a<21)
  {
    if(a>19)
   {
     if(a>21)
     {
       System.out.println("b");
     }
     else
     {
       System.out.println("a");
     }
   }
  }
 }
}
public class Exe3
{
 public static void main(String[] args)
 {
  NestedIf obj=new NestedIf();
  obj.test();
 }
}