class MultiThr
{
 public static void main(String[] args)
 {
  String name=Thread.currentThread().getName();
  System.out.println(name);
  System.out.println(Thread.currentThread().getPriority());
  Thread t=Thread.currentThread();
  t.setName("Rama");
  t.setPriority(1);
  String name1=Thread.currentThread().getName();
  System.out.println(name1);
  System.out.println(Thread.currentThread().getPriority());

  }
}