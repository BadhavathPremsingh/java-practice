class LiSe2D
{
 public static boolean algo(int arr[][],int target)
 {
  if(arr.length==0)
  {
   return false;
  }
  for(int ele[]:arr)
  {
   for(int element:ele)
   {
    if(element==target)
    {
     return true;
    }
   }
  }
 return false;
}
public static void main(String[] args)
{
  int arr[][]={{1,2,3},
               {4,5,6},
               {7,8,9}};
  int target=8;
  System.out.println(algo(arr,target));
}
}