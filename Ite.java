import java.util.*;
class Ite
{
 public static void main(String[] args)
 {
  ArrayList<String> al=new ArrayList<String>();
  al.add("Hi");
  al.add("Hello");
  al.add("good");
  ListIterator<String> it=al.ListIterator();
  while(it.hasNext())
  {
    it.next();   
  }
  while(it.hasPrevious())
  {
    String n=it.previous();
    System.out.println(n);
   }
}
}
  