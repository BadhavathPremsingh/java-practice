import java.io.*;
import java.util.*;
class Switch
{
  public void test()
  {
    int a=3;
    switch(a)
    {
     case 1:System.out.println("1");
     break;
     case 2:System.out.println("2");
     break;
     case 3:System.out.println("3");
     break;
     case default:
     System.out.println("default");
    }
  }
}
public class Exe4
{
  public static void main(String[] args)
  {
   Switch obj=new Switch();
   obj.test();
  }
}