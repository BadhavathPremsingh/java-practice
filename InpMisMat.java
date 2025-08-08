import java.util.*;
class InpMisMat
{
 public static void main(String[] args)
 {
  int age=0;
 Scanner sc=new Scanner(System.in);
 try
 {
  age=sc.nextInt();
 }
 catch(InputMismatchException e)
 {
  System.out.println(e);
 }

finally
{
 sc.close();
}
System.out.println(age);
}
}