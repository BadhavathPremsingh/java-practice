class GenMet
{
 static <T> void getName(T element)
 {
  System.out.println(element.getClass().getName()+element);
 }
 public static void main(String[] args)
 {
  getName(5);
  }
}