import java.io.*;
import java.util.*;
class Jump
{
 public void test()
 {
  for(int i=0;i<4;i++)
  { 
   if(i==2)
   
    continue;
   System.out.println("hi");
  System.out.println(i);
  }
 }
}
public class Exe5
{
  public static void main(String[] args)
  {
    Jump obj=new Jump();
    obj.test();
   }
}
  