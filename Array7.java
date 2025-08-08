import java.io.*;
import java.util.*;
class Array7
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int arr[]=new int[size];
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=sc.nextInt();
  }
  for(int i=0;i<arr.length;i++)
  {
   System.out.print(arr[i]);
  }
  int max=arr[0];
  for(int i=1;i<arr.length;i++)
  {
   if(arr[i]>max)
   {
     max=arr[i];
   }
  }
 System.out.println("The largest number is:"+max);
 }
}
   