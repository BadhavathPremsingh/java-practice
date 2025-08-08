class Person
{
  public void show()
  {
   System.out.println("This is Person");
  }
 String name="Rama";
}
class Father extends Person
{
  public void show()
  {
   System.out.println("This is Father");
  }
}
class Hero extends Person
{
 public void show()
 {
  System.out.println("This is Hero");
 }
}
class PolyExe
{
 public static void main(String[] args)
 {
   Person obj;
   Father obj1=new Father();
   Hero obj2=new Hero();
   obj=obj1;
   obj.show();
   obj=obj2;
   obj.show();
   System.out.println(obj.name);
   }
}