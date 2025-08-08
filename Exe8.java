import java.io.*;
import java.util.*;
class Pattern3
{
  Scanner sc=new Scanner(System.in);
  public void test()
  {
   int n=sc.nextInt();
   System.out.println(n);
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n-1;j++)
     {
      if((i==0&&j>0&&j<n-2)||(i>0&&j==0)||(i>0&&j==n-2)||i==n/2)
      {
       System.out.print("* ");
      }
      else
       {
         System.out.print("  ");
       }
     }
    System.out.println();
   }
  }
}
public class Exe8
{
  public static void main(String[] args)
  {
    Pattern3 obj=new Pattern3();
    obj.test();
  }
}