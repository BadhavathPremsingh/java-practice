class MulThrExt extends Thread
{
 public void run()
 {
  System.out.println("child Thread");
 }
}
class MulThrExtExe
{
 public static void main(String[] args)
 {
  MulThrExt obj=new MulThrExt();
  obj.start();
 }
}