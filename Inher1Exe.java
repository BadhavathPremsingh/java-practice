class Inher1
{
 public void first()
{
 System.out.println("In parent class");
 }
}
class InherC1 extends Inher1
{
  public void second()
 {
  System.out.println("In first child class");
 }
}
class InherC2 extends InherC1
{
  public void third()
  {
   System.out.println("In second child class");
  }
}
class Inher1Exe
{
 public static void main(String[] args)
 {
  InherC2 obj1=new InherC2();
  obj1.second();
  obj1.first();
  obj1.third();
 }
}