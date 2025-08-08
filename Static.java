class Static
{
  static int age=21;
  static String school="Oxford";
  static void print()
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
  System.out.println(Static.age);
  System.out.println(Static.school);
  Static.print();
  System.out.println(Static.principal);
  }
}
  