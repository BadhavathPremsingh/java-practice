class StrBufFin
{
 public static void main(String[] args)
 {
  final StringBuffer a=new StringBuffer("hi");
  System.out.println(a);
  a.append("hello");
  System.out.println(a);
  a=new StringBuffer("abc");
  System.out.println(a);
 }
}