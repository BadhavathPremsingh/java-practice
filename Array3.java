import java.io.*;
import java.util.*;
class Array3
{
 public static void main(String[] args)
 {
  Array4 obj=new Array4();
  obj.scanArr();
  int arr[]=new int[]{1,2,3,4,5};
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]);
  }
 }
}
class Array4
{
  public void scanArr()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size");
   int size=sc.nextInt();
   int arr1[]=new int[size];
   for(int i=0;i<size;i++)
   {
    arr1[i]=sc.nextInt();
   }
   for(int i=0;i<size;i++)
   {
     System.out.print(arr1[i]);
   }
  }
 }