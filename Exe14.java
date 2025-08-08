import java.util.*;
class Pattern14
{
 Scanner sc=new Scanner(System.in);
 public void test()
 {
  int n=sc.nextInt();
  int i,j;
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=i;j++)
   {
    if((i+j)%2==0)
    {
      System.out.print("1 ");
    }
    else
    {
     System.out.print("0 ");
    }
   }
   System.out.println();
   }
  }
 }

public class Exe14
{
 public static void main(String[] args)
 {
   Pattern14 obj=new Pattern14();
   obj.test();
  }
}