private class Demo1
{
  Demo1()
  {
   System.out.println("In zero parameterized constructor");
  }
  Demo1(int a,int b)
  {
   System.out.println("Numbers are:"+a+"and"+b);
  }
}
class Demo2 extends Demo1
{
  Demo2()
  {
    this(19);
    System.out.println("In second zero parameterized constructor");
  }
  Demo2(int a)
  {
    super(10,30);
  }
}
class SupMetExe
{
 public static void main(String[] args)
 {
  Demo2 obj=new Demo2();
 }
}
  