class MyException extends Exception
{
  public MyException(String msg)
  {
   super(msg);
  }
}
class MyExpExe 
{
  public static void main(String[] args)
  {
    int a=10,b=0;
    try{
    if(b<=0)
     {
      throw new MyException("b should be greater than 0");
      }
     else
     {
      System.out.println("result:"+a/b);
     }
    }
    catch(MyException e)
    {
      System.out.println("Enter a valid number"+e);
    }
   }
  }