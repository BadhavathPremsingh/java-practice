import java.util.*;
class LiList
{
 public static void main(String[] args)
 {
  LinkedList<Object> ll=new LinkedList<Object>();
  ll.add(1);
  System.out.println(ll);
  ll.add(1);
  System.out.println(ll.get(1));
  ll.add(1,2);
  System.out.println(ll);
  System.out.println(ll.peek());
  System.out.println(ll);
  System.out.println(ll.poll()); 
  System.out.println(ll);

/*
  LinkedList<Object> ll1=new LinkedList<Object>();
  ll1.add("hi");
  ll.addAll(ll1);
  System.out.println(ll);*/
 }
}