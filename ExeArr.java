import java.io.*;
import java.util.*;
class ArrObj
{  
  int age;
  String name;
  public void ArrObj(int age,String name)
  {
    this.age=age;
    this.name=name;
  }
  public void display()
  {
   System.out.println("The Student name is:"+name+"age is:"+age);
  }
}
class ArrExe1
{
 public static void main(String[] args)
 {
  ArrObj obj[];
  obj=new ArrObj[2];
  obj[0]=new ArrayObj(21,"Ram");
  obj[1]=new ArrayObj(22,"Ravan");
  System.out.println("The data of first element is:"+obj[0].display());
  System.out.println("The data of second element is:"+obj[1].display());
 }
}