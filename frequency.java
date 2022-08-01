//WAP to find frequency of numbers in array?
import java.util.*;
public class frequency{
  
    public static void main(String[] args){
        int n,m;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        n=s.nextInt(); 
       //System.out.println("Enter the size array2:");
        //m=s.nextInt(); 
        int arr[]=new int[n];     //Array Declaration
        int arr2[]=new int[n];
       int count;
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
          arr[i]=s.nextInt();
        }
       System.out.println("the elements of the array2 is 'o':");
      for(int k=0;k<n;k++)
        arr2[k]=0;
      System.out.println("=====================");
      for(int i=0;i<n;i++)
        { 
           count=1;
          for(int j=i+1;j<n;j++)
            { //                  
              if((arr2[j]==0)&&(arr[i]==arr[j]))
                 {
                count++;
                arr2[j]=1;
                 }
            }
         if(arr2[i]==0)
      System.out.println(arr[i]+"==="+count);
       
        }
      
      
    }
}