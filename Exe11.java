import java.io.*;
import java.util.*;
class Pattern11
{ 
  Scanner sc=new Scanner(System.in);
  public void test()
  {
   int i,j;
   int n=sc.nextInt();
   for(i=1;i<=6;i++)
   {
    for(j=1;j<=i;j++)
    {
      System.out.print(i+" ");
    }
   System.out.println();
   }
  }
}
class Exe11
{
 public static void main(String[] args)
 {
  Pattern11 obj=new Pattern11();
  obj.test();
 }
}