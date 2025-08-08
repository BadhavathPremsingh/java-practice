interface A
{
  void show();
  default void met1()
  {
   System.out.println("In Met1");
  }
  static void met2()
  {
   System.out.println("In Met2");
  }
}
interface C
{
 void doNotShow();
}
class B implements A,C
{
  public void show()
  {
   System.out.println("In Show method");
  }
  public void doNotShow()
  {
   System.out.println("In do not show method");
  }
}
class InterfExe
{
 public static void main(String[] args)
 {
  B obj=new B();
  obj.show();
  A obj1=new B();
  obj1.show();
  obj.doNotShow();
  obj.met1();
 // obj.met2();
  A.met2();
 }
}