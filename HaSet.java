import java.util.*;
class HaSet
{
 public static void main(String[] args)
 {/*
  HashSet<Object> hs=new HashSet<Object>();
  hs.add(1);
  System.out.println(hs);*/
  LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
  lhs.add(1);
  lhs.add(1);
  System.out.println(lhs);

 }
}