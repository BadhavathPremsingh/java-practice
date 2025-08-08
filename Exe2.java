import java.io.*;
import java.util.*;
class IfElseLadder
{
  public void test()
  {
  int a=25,b=60;
  if(a>200)
  {
   System.out.println("a");
  }
  else if(a>20&&b<30)
  System.out.println("b");
  else if(a>20&&b>20)
  System.out.println("bb");
   else
  {
   System.out.println("c");
  }
}
} 
public class Exe2
{
 public static void main(String[] args)
 {
  IfElseLadder obj=new IfElseLadder();
  obj.test();
 }
}