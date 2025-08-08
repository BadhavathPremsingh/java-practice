import java.io.*;
import java.util.*;
class ArrObj
{  
  public int a;
  public String n;
  ArrObj(int age,String name)
  {
     a=age;
     n=name;
  }
 void display()
  {
   System.out.println("The Student name is:"+n+"age is:"+a);
    
 }
}
public class ArrExe1
{
 public static void main(String[] args)
 {
  ArrObj obj[];
  obj=new ArrObj[2];
  obj[0]=new ArrObj(21,"Ram");
  obj[1]=new ArrObj(22,"Ravan");
  System.out.println("The data of first element is:");
  obj[0].display();
  System.out.println("The data of second element is:");
  obj[1].display();
 }
}