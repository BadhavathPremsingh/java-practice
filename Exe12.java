import java.io.*;
import java.util.*;
class Pattern12
{
 Scanner sc=new Scanner(System.in);
 public void test()
 {
  int n=sc.nextInt();
  int i,j;
  for(i=n;i>=1;i--)
  {
   for(j=1;j<=i;j++)
   {
    System.out.print(j+" ");
   }
  System.out.println();
  }
 }
}
public class Exe12
{
  public static void main(String[] args)
  {
    Pattern12 obj=new Pattern12();
    obj.test();
  }
}