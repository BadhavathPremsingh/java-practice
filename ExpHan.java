class ExpHan
{
  public static void main(String[] args)
  {
    int a=8;
    int b=0;
    int result=0;
    try
    {
     result=a/b;
     System.out.println("In try block");
    } 
    catch(ArithmeticException e)
    {
     System.out.println("Arithmetic Exception"+e);
    }
    catch(Exception e)
    {
     System.out.println(e);
    }
    System.out.println(result);
   }
}