import java.util.*;
public class Array7
{
    public static void main(String[] args)
    {
         /*  int size;
        Scanner s=new Scanner(System.in);
     
        System.out.println("Enter the number of elements :");
        size=s.nextInt();    
       
        int arr[]=new int[size];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)     //Array Initialization
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int ele = s.nextInt();
   
  for(int i=ele;i<size-1;i++)
    {
      if(arr[i] == ele)   //If element found
      {
        // shifting elements
        for(int j = i; j < size- 1; j++)
        {
            arr[j] = arr[j+1];
        }
        break;
      }
    }
     
       System.out.println("Elements after deletion " );
       for(int i = 0; i < size-1; i++)
       {
             System.out.print(arr[i]+ " ");
       } */

      
int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      for(int k=0;k<n;k++)
        System.out.println(" "+a[k-2]);
 
    }
}