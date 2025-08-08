class Gen<T>
{
 T var;
 Gen(T var)
 {
  this.var=var;
 }
 public T getVar()
 {
  return this.var;
 } 
}
class GenExe
{
 public static void main(String[] args)
 {
  Gen<Integer> ivar=new Gen<Integer>(5);
  System.out.println(ivar.getVar());
  Gen<String> svar=new Gen<String>("Hi");
  System.out.println(svar.getVar());
 }
}