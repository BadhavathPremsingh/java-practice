interface Car
{
  public void drive(int speed,String name);
}
class LambExe
{
 public static void main(String[] args)
 {
  Car obj=(speed,name)->System.out.println("In Drive method speed is:"+speed+"car name is"+name);
  obj.drive(100,"RollsRoyce");
 }
}