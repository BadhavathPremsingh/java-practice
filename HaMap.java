import java.util.*;
class HaMap
{
 public static void main(String[] args)
 {
  HashMap<Object,Object> m1=new HashMap<>();
  m1.put(1,2);
  m1.put(2,3);
  m1.put(0,0);
  m1.put(3,4);
   Collection value=m1.values();
   Iterator it1=value.iterator();
   while(it1.hasNext())
   {
    System.out.println(it1.next());
    Integer i1=(Integer)it1.next();
    System.out.println(i1);
    
 }
  Set es=m1.entrySet();
  Iterator it2=es.iterator();
  while(it2.hasNext())
  {
   //System.out.println(it2.next());
   Map.Entry data=(Map.Entry)it2.next();
   System.out.println(data.getKey()+":"+data.getValue());
}
}
}