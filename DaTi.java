import java.util.*;
class DaTi
{
 public static void main(String[] args)
 {
  java.util.Date dt=new java.util.Date();
  System.out.println(dt);
  long timeInMS=dt.getTime();
  java.sql.Date dt1=new java.sql.Date(timeInMS);
  System.out.println(dt1);
  }
}