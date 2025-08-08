interface One
{
  void metOne();
}
class AnoInnExe{
  public static void main(String[] args)
  {
   One obj=new One()
   {
    public void metOne()
    {
     System.out.println("In anonymous inner class");
    }
   };
  obj.metOne();
}
}
