class ThisSupMet
{
  ThisSupMet()
  {
    this(19);
    System.out.println("This is zero parameterized constructor");
  }
  ThisSupMet(int age)
  {
   
   System.out.println("This is one parameterized constructor");
  }
}
class ThisSupMetExe
{
  public static void main(String[] args)
  {
    ThisSupMet obj=new ThisSupMet();
    ThisSupMet obj1=new ThisSupMet(21);
   }
}
  