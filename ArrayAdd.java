import java.io.*;
import java.util.*;
class ArrayAdd
{
 Scanner sc=new Scanner(System.in);
 int size, arr1[],arr2[];
 public void scan()
 {
  System.out.println("enter the size");
  size=sc.nextInt();
  arr1=new int[size];
  arr2=new int[size];
  for(int i=0;i<size;i++)
  {
    arr1[i]=sc.nextInt();
    arr2[i]=sc.nextInt();
  }
 }
 public void printMatrix()
 {
  for(int i=0;i<size;i++)
  {
   System.out.print(arr1[i]+" ");
   System.out.println();
  }
  for(int i=0;i<size;i++)
  {
   System.out.print(arr2[i]+" ");
   System.out.println();
  }
 }
 public void add()
 {
  for(int i=0;i<size;i++)
  {
    System.out.print(arr1[i]+arr2[i]+" ");
  }
 }
}
public class Result1
{
 public static void main(String[] args)
 {
  ArrayAdd obj=new ArrayAdd();
  obj.scan();
  obj.printMatrix();
  obj.add();
 }
} 

   
