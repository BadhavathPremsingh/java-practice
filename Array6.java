import java.io.*;
import java.util.*;
class Array6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++) 
     {
       System.out.println(arr[i][j]=sc.nextInt());
      }
   }
    for(int i=0;i<row;i++)
    for(int j=0;j<col;j++)  
    {
      System.out.print(arr[i][j]);
    }
  }
 } 