class LiSe2
{
 public static int algo(int arr[],int target)
 {
  if(arr.length==0)
  {
   return -1;
  }
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]==target)
   {
    return i;
   }
  }
 return -1;
 }
public static void main(String[] args)
{
  int arr[]={3,6,7,2,4};
  int target=7;
  System.out.println(algo(arr,target));
 }
}
 