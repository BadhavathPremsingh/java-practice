import java.util.*;
class RoCo2D
{
 public static int[] algo(int arr[][],int target)
 {
  int row=0,column=arr.length-1;
  while((row<arr.length)&&(column>=0))
  {
   if(arr[row][column]==target)
   {
    return new int[]{row,column};
   }
   else if(arr[row][column]<target)
   {
     row++;
    }
   else
   {
    column--;
   }
  }
  return new int[]{-1,-1};
}
public static void main(String[] args)
{
  int arr[][]={{20,43,56},
               {21,44,78},
               {33,59,89}};
  int target=59;
  int ans[]=algo(arr,target);
  System.out.println(Arrays.toString(ans));
}
}