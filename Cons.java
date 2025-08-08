class Cons
{
  private int age;
  private String name;
  public void Cons(int age,String nam)
  {
   this.age=age;
   this.name=name;
  }
  Cons()
 {
  System.out.println("Zero parameterized constructor");
 }
 Cons(int age)
 {
  this.age=age;
 }
public void show()
{
  System.out.println(name+age);
}
}
class ConsExe
{
 public static void main(String[] args)
 {
  Cons obj=new Cons();
 }
}
  
 