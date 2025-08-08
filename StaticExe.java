class Static
{
  static int age=21;
  static String school="Oxford";
  public static void print()
  {
   System.out.println("In static method");
  }
  static String principal;
  static
  {
   principal="Rama";
  }
}
class StaticExe
{
 public static void main(String[] args)
 {
  Static obj=new Static();
 // System.out.println(Static.age);
 // System.out.println(Static.school);
 // Static.print();
 // System.out.println(Static.principal);
  }
}
  