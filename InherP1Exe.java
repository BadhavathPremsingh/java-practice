class Inher1
{
 public void first()
{
 System.out.println("In parent class");
 }
}
class InherC1 extends InherP1
{
  public void second()
 {
  System.out.println("In first child class");
 }
}
class Inher1Exe
{
 public static void main(String[] args)
 {
  InherC1 obj1=new InherC1();
  obj1.second();
  obj1.first();
 }
}