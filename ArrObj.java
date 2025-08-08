import java.io.*;
import java.util.*;
class ArrObj
{
  int rollno;
  String name;
  public void arr(int rollno,String name)
  {
    this.rollno=rollno;
    this.name=name;
   ArrObj obj[]=new ArrObj[3];
     obj[]=new ArrObj[3]{new obj[1,"Ram"],new obj[2,"Ravan"],new obj[3,"Hanuman"]};
    }
 }
public class ExeArr
{
 public static void main(String[] args)
 {
   for(int i=0;i<3;i++)
   {
    System.out.print(ArrObj[i].rollno+ArrObj[i].name);
   }
 }
}