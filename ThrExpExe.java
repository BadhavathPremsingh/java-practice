class ThrExp
{
 public void divide() throws Exception
 {
   int a=10,b=0;
   int c=a/b;
   array();
 }
 public void array() throws Exception
 {
  int a[]={1,2,3};
  System.out.println(a[7]);

 }
}
class ThrExpExe
{
 public static void main(String[] args)  
 {
 ThrExp obj=new ThrExp();
  try{
   obj.divide();
   }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}