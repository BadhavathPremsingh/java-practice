import java.util.*;
import java.util.concurrent.*;
class FaSafe
{
 public static void main(String[] args)
 {
  CopyOnWriteArrayList<Object> al=new CopyOnWriteArrayList<>();
  al.add(1);
  al.add(2);
  al.add(3);
  System.out.println(al);
  Iterator<Object> it=al.iterator();
  while(it.hasNext())
  {
   Object o=it.next();
   System.out.println(o);
   al.add(4);
   al.add(5);
 }
  System.out.println(al);
}
}