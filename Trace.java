import java.io.*;
import java.util.*;
class Trace
{
 static void trace1(int arr2[][],int size)
 {
  int add=0;
  for(int i=0;i<size;i++)
  {
   for(int j=0;j<size;j++)
   {
    if(i==j)
    {
     add=add+arr2[i][j];
    }
   }
  
  }
System.out.println(add);
}
public static void main(String[] args)
{
  int arr2[][]={{1,2,3},{2,3,4},{3,4,5}};
  int size=3;
  trace1(arr2,3);
 }
}
    