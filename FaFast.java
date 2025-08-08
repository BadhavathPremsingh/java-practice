import java.util.*;
class FaFast
{
 public static void main(String[] args)
 { 
  ArrayList<Object> al=new ArrayList<>();
  al.add(1); 
  al.add(2);
  Iterator it=al.iterator();
  while(it.hasNext())
  {
   Object o=it.next();
   System.out.println(o);
   al.add(3);
  }
 }
}