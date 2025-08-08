class BinSe
{
  int row=0;
  if((target>matrix[row][0])&&(target<matrix[row][matrix[row].length-1]))
  {
   for(int i=0;i<matrix[row].length;i++);
   {
    arr[i]=matrix[row][0];
   }
  }
  else
  {
   row++;
  }
  public static boolean algo(int arr[],int target)
  {
   int beginning=0,end=matrix.length,row=0;
   int mid;
   if(target>matrix[row][0]&&target<matrix[row].length)
   while(beginning<=end)
   {
    mid=beginning+end/2;
    if(mid==target)
    {
     return true;
    }
    else if(mid<target)
    {
     end=mid-1;
    }
    else if(mid<target)
    {
     beginning=mid+1;
    }
   return false;
   }
  }
public static void main(String[] args)
{
  static int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
  static int target=7;
  algo(arr,target);
 }
}

   