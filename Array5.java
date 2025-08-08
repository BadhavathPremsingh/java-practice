import java.io.*;
import java.util.*;
class Array5
{
  public static void main(String[] args)
  {
    int row=2,col=2;
    int arr[][]=new int[row][col];
    arr[0][0]=1;
    arr[0][1]=2;
    arr[1][0]=3;
    arr[1][1]=4;
    for(int i=0;i<row;i++)
    {
     for(int j=0;j<col;j++)
     {
       System.out.print(arr[i][j]);
      }
     }
   }
}
    