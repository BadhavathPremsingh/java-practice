import java.io.*;
import java.util.*;
class ArrayTranspose
{
 public static void printMatrix(int arr[][],int size)
 {
  for(int i=0;i<size;i++)
  {
   for(int j=0;j<size;j++)
   {
    System.out.print(arr[i][j]+" ");
   }
  System.out.println();
  }
}
 public static void Transpose(int arr[][],int size)    
 {
  for(int i=0;i<size;i++)
  {
   for(int j=0;j<size;j++)
   {
     System.out.print(arr[j][i]+" ");
   }
  System.out.println();
  }
}
  public static void main(String[] args)
  {
    int arr[][]={{1,2},{4,5}};
    printMatrix(arr,2);
    Transpose(arr,2);
  }
}