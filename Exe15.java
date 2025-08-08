import java.util.*;
class Pattern15
{
 Scanner sc=new Scanner(System.in);
 public void test()
 {
  int n=sc.nextInt();
  int i,j;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n-i;j++)
    {
      System.out.print("  ");
    }
  for(j=i;j>=1;j--)
  {
    System.out.print(j+" ");
   }
  
   for(j=2;j<=i;j++)
  {
   System.out.print(j+" ");
  }
  System.out.println();
  }
 }
}
public class Exe15
{
  public static void main(String[] args)
  {
    Pattern15 obj=new Pattern15();
    obj.test();
   }
}