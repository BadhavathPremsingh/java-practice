import java.io.*;
import java.util.*;
class Student
{
 int age;
 String name;
 public void setData(int age,String name)
 {
  this.age=age;
  this.name=name;
  }
  public void display()
  {
   System.out.println("The student details are:"+name+age);
  }
 }
public class ArrExe2
{
  public static void main(String[] args)
  {
   Student obj[];
   obj=new Student[2];
    obj[0]=new Student();
    obj[1]=new Student();
    obj[0].setData(21,"Rama");
    obj[1].setData(22,"Ravana");
    System.out.println("The first element is :");
    obj[0].display();
    System.out.println("The second element is:");
    obj[1].display();
   }
}
    