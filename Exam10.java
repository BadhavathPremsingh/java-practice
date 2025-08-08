import java.io.*;
import java.util.*;
public class Pattern10
{
 Scanner sc=new Scanner(System.in);
 public void test()
 {
   int n=sc.nextInt();
   for(int i=1;i<=(n);i++)
   {
    for(int j=1;j<=n-i;j++)
    {
      System.out.print(" ");
    }
   for(j=1;j<=i;j++)
   {
    System.out.print(j );
   }
   System.out.println();
  }
}
 public class Exe10
 {
  public static void main(String[] args)
  {
    Pattern10 obj=new Pattern10();
    obj.test();
  }
} 