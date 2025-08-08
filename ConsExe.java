class cons
{
  private int age;
  private String name;
  Cons(int age,String name)
  {
   this.age=age;
   this.name=name;
  }
  Cons()
 {
  System.out.println("Zero parameterized constructor");
  age=21;
  name="Ram";
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
  obj.show();
  Cons obj1=new Cons(19,"Rama");
  obj1.show();
  Cons obj2=new Cons(19);
  obj2.show();
 }
}
  
 