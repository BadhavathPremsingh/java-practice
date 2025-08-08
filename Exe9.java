import java.io.*;
import java.util.*;
class Pattern9
{
  Scanner sc=new Scanner(System.in);
  public void test()
  {
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
     {
       if((i+j==3)||(j-i==3)||(i-j==3)||(i+j==9))
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
public class Exe9
{
 public static void main(String[] args)
 {
  Pattern9 obj=new Pattern9();
  obj.test();
 }
}