import java.io.*;
import java.util.*;
class Pattern13
{
 Scanner sc=new Scanner(System.in);
 public void test()
 {
  int n=sc.nextInt();
  int i,j;
  int num=1;
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=i;j++)
   {
    System.out.print(num+" ");
    num++;
   }
   System.out.println();
  }
 }
}
public class Exe13
{
 public static void main(String[] args)
 {
  Pattern13 obj=new Pattern13();
  obj.test();
 }
}
