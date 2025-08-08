import java.util.*;
class TSet
{
  public static void main(String[] args)
  {
    TreeSet<Object> ts=new TreeSet<>();
    ts.add(1);
    ts.add(2);
    ts.add(11);
    ts.add(5);
    ts.add(7);
    System.out.println(ts);
    System.out.println(ts.higher(6));
    System.out.println(ts.lower(4));
    System.out.println(ts.ceiling(3));
    System.out.println(ts.floor(5.5));
  }
}