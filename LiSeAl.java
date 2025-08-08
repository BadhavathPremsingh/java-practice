class LiSeAl
{ 
 int element;
 public static boolean LiSe(int arr[],int target)
 { 
  if(arr.length==0)
  {
   return false;
  }
  for(int i=0;i<arr.length;i++)
  {
    element=arr[i];
  }
  if(element==target)
  {
   return true;
  }
  return false;
 }
public static void main(String[] args)
{
 int arr[]={6,3,1,7,4};
 int target=1;
 boolean ans=LiSe(arr,target);
 System.out.println(ans);
}
}
 
  