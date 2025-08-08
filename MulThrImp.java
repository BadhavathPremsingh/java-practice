class MulThrImp implements Runnable
{
 public void run()
 {
  System.out.println("In run Method");
 }
}
class MulThrImpExe 
{
 public static void main(String[] args)
 {
  MulThrImp obj=new MulThrImp();
  Thread t=new Thread();
  obj.start(t);
 }
}
