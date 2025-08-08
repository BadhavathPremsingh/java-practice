class BubSort
{
 public static void main(String[] args)
 {
  int arr[][]={{9,3,5},{8,3,5},{2,5,1}};
  for(int i=0;i<arr.length-1;i++)
  {
   for(int j=0;j<arr.length-1;j++)
   {
    for(int k=0;k<arr.length-j-1;k++)
    {
    if(arr[j][k]>arr[j][k+1])
    {
      int temp=arr[j][k];
      arr[j][k]=arr[j][k+1];
      arr[j][k+1]=temp;
    }
   }
  }
 }
  printArray(arr);
 }   
 public static void printArray(int arr[][])
 {
  for(int i=0;i<arr.length-1;i++)
  {
   for(int j=0;j<arr.length-1;i++)
   {
   System.out.print(arr[i][j]+" ");
  }
  System.out.println();
 }
 }
}