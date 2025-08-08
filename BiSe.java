import java.util.*;
class BiSe
{
  public static void main(String[] args)
  {
   int mid,n,i,target;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array:");
   n=sc.nextInt();
   System.out.println("Enter the array elements:");
   int arr[]=new int[n];
   for(i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }

   System.out.println("Enter target:");
   target=sc.nextInt();

   int beginning=0,end=n-1;

   while(beginning<=end)
   {
    mid=(beginning+end)/2;
    if(arr[mid]==target)
    {
      System.out.println("At index:"+mid);
      break;
    }
    else if(target<arr[mid])
    {
     end=mid-1;
    }
    else if(target>arr[mid])
    {
     beginning=mid+1;
    }
   }
  }
}   