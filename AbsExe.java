abstract class Remote
{
  abstract void turnOn();
  abstract void turnOff();
  public void work()
  {
   System.out.println("Remote is working");
  }
  String name;
}
class Television extends Remote
{
 public void turnOn()
 {
  System.out.println("TV gets on");
 }
 public void turnOff()
 {
  System.out.println("TV gets off");
 }
 public void notWorking()
 {
  System.out.println("TV is not Working");
 }
}
class AC extends Remote
{
 public void turnOn()
 {
  System.out.println("AC is ON");
 }
 public void turnOff()
 {
  System.out.println("AC is OFF");
 }
} 
class AbsExe
{
 public static void main(String[] args)
 {
  Remote obj=new Television();
  obj.turnOn();
  obj.turnOff();
  obj.work();
  ((Television)obj).notWorking();
  obj=new AC();
  obj.turnOn();
  obj.turnOff();
  System.out.println(obj.name="Rama");
  }
}