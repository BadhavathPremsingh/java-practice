class Synch extends Thread
{
  public synchronized void run()
  {
   try
   {
   System.out.println(Thread.currentThread().getName()+"Enter the lot");
   Thread.sleep(1000);
   System.out.println(Thread.currentThread().getName()+"Took the Car");
   Thread.sleep(1000);
   System.out.println(Thread.currentThread().getName()+"Parked the Car");
   Thread.sleep(1000);
   }
  catch(Exception e)
  {
   System.out.println("some error"+e);
  }
 }
}
public class SynchExe
{
 public static void main(String[] args)
 {
  Synch obj1=new Synch("son1");
 // obj1.setName("son1");
  obj1.start();
 /*
  Synch obj2=new Synch();
  Synch obj3=new Synch();
  obj1.setName("son1");
  obj2.setName("son2");
  obj3.setName("son3");
  obj1.start();
  obj2.start();
  obj3.start();
 */
  }
}