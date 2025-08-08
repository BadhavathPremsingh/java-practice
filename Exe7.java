import java.io.*;
import java.util.*;
class Pattern2
{
  Scanner sc=new Scanner(System.in);
  public void test()
  {
    int n=sc.nextInt();
    System.out.println(n);
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
     {
       if(i==0||j==0||i==(n-1)||(j==n-1))
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
class Exe7
{
  public static void main(String[] args)
  {
    Pattern2 obj=new Pattern2();
    obj.test();
  }
}