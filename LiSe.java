class LiSe
{
 public static Boolean algo(int arr[],int target)
 {
  if(arr.length==0)
  {
   return false;
  }
  for(int element:arr)
  {
   if(element==target)
   {
    return true;
   }
  }
  return false;
 } 
public static void main(String[] args)
{
  int arr[]={3,5,2,1};
  int target=2;
 System.out.println(algo(arr,target));
}
}
    