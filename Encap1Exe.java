class Encap1
{
 private int age;
 private String name;
 public void setAge(int age)
 {
  this.age=age;
 }
 public void setName(String name)
 {
  this.name=name;
 }
 public void show()
 {
  System.out.println(name+age);
 }
}
class Encap1Exe
{
 public static void main(String[] args)
 {
  Encap1 obj=new Encap1();
  obj.setAge(19);
  obj.setName("Rama");
  obj.show();
 }
}