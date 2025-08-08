import java.io.*;
import java.util.*;
class Pattern1
{
  Scanner sc=new Scanner(System.in);
  public void test()
  {
     int n=sc.nextInt();
     System.out.println(n);
      for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=5;j++)
    {
      System.out.print("* ");
    }
    System.out.println();
   }
  }

}
public class Exe6
{
 public static void main(String[] args)
 {
  Pattern1 obj=new Pattern1();
  obj.test();
 }
}