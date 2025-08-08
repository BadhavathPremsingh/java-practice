package one;

public class Strong {
   public static boolean isStrong(int num)
   {
	   int num2=num,digit=0,sum=0;
	   while(num2>0)
	   {
		   int factorial=1;
		   digit=num2%10;
		   for(int i=digit;i>=1;i--)
		   {
			 factorial*=i;  
		   }
		   sum+=factorial;
		   num2/=10;
		   
	   }
	   if(num==sum)
	   {
		   return true;
	   }
	   return false;
   }
   public static void main(String[] args)
   {
	  System.out.println(isStrong(145));
   }

}
