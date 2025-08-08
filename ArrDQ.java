import java.util.*;
class ArrDQ
{
 public static void main(String[] args)
 {
  ArrayDeque<Object> ad=new ArrayDeque<Object>();
  ad.add(1);
  ad.add(1);
  System.out.println(ad);
  ad.offer(3);
  System.out.println(ad);
  ad.offerFirst(5);
  ad.offerLast(6);
  System.out.println(ad);
 }
}