import java.io.*;
import java.util.*;
class Array8
{
 public static void main(String[] args)
 {
  int a[]={1,2,3,4};
  int b[]=a.clone();
  
  for(int i=0;i<b.length;i++)
  {
  System.out.print(b[i]);
  }
 System.out.println();
 int aa[][]={{1,2},{2,3},{2,2,2,4}};
 int bb[][]=aa.clone();
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<bb[i].length;j++)
   {
     System.out.print(bb[i][j]);
   }
  }
 }
}