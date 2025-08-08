class Encap
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
 public int getAge()
 {
  return age;
 }
 public String getName()
 {
  return name;
 }
public void show()
{
 System.out.println(name+age);
}
}
class EncapExe
{
 public static void main(String[] args)
 {
  Encap obj=new Encap();
  obj.setAge(19);
  obj.setName("Rama");
  System.out.println(obj.getAge());
  System.out.println(obj.getName());
  // obj.show();
 }
}