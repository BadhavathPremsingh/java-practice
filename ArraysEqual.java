import java.io.*;
import java.util.*;
class ArraysEqual
{
 public static void checkResult(int a[],int b[])
 {
  Boolean result=Arrays.equals(a,b);
  if(result==true)
 {
   System.out.print("they are equal");
 }
 else
 {
  System.out.print("they are not equal");
 }
}
public static void printMatrix(int a[],int b[])
{
  for(int i=0;i<a.length;i++)
  {
   System.out.print(a[i]+" ");
  }
  System.out.println();
 for(int i=0;i<b.length;i++)
 {
  System.out.print(b[i]+" ");
 }
}
public static void main(String[] args)
{
  int a[]={1,2,3};
  int b[]={1,2,3};
  printMatrix(a,b);
  checkResult(a,b);
  
}
}
  