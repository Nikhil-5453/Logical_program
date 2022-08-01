//WAP to print array values in sorted order?
import java.util.*;
public class arraysort{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    int temp;
    System.out.println("size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter values to array");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("sorted into ascending order ");
    for(int i=0;i<n;i++)
      System.out.println(arr[i]+" ");
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    
    System.out.println("sorted into descending order");
    for(int i=0;i<n;i++)
      System.out.println(arr[i]+" ");
    
  
  
  }
}