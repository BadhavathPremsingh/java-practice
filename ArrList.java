import java.util.*;
class ArrList
{
 public static void main(String[] args)
 {
  ArrayList<Object> al=new ArrayList<Object>();
  
  al.add(1);
  al.add("three");
  al.add(2);
  al.add("one");
  al.add("two");

  System.out.println(al);
 
  System.out.println(al.contains(1));
  al.ensureCapacity(10);
  System.out.println(al.size());
  al.trimToSize();
  System.out.println(al.size());
  al.add(1);
  System.out.println(al);
  //al.clear();
  System.out.println(al);  
 
  List<Object> al1=new ArrayList<Object>();
  al1.add("hi");
  al1.add("5");
  System.out.println(al1);
  al1.add(1.1);
  System.out.println(al1);
  al1.add(1,1);
  System.out.println(al1);

  ArrayList<Object> al2=new ArrayList<Object>();
  al2.add(4);
  al1.addAll(al2);
  System.out.println(al1);
  System.out.println(al2.get(2));
  
  
  }
}