import java.util.*;
class MulRunMet implements Runnable
{
  public void run()
  {
   String name1=Thread.currentThread.getName();
   if(name1.equals("CALC"))
   {
    calc();
   }
   else
   {
    importantMsg();
   }
 }
public void calc()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("calc method started");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=a+b;
  System.out.println(c);
}
public void importantMsg()
{
  System.out.println("important message printed");
  try
  {
  for(int i=0;i<3;i++)
   {
     System.out.println("Focus is important");
      Thread.sleep(1000);
    }
   }
  catch(Exception e)
  {
   System.out.println("some proble"+e);
  }
 }
public class MulRunMetExe
{
 public static void main(String[] args)
 {
  MulRunMet obj1=new MulRunMet();
  MulRunMet obj2=new MulRunMet();
  obj1.setName("CALC");
  obj2.setName("PRINT");
  Thread t1=new Thread(obj1);
  Thread t2=new Thread(obj2);
  t1.start();
  t2.start();
  }
}