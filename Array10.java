//WAP to remove duplicate element in arrray?
import java.util.*;
public class Array10{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,i,sum=0,j;
    System.out.println("enter size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements into array");
    for(i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++){
          if(arr[i]==arr[j]){
            ///System.out.println("duplicate elment found: "+arr[j]);
            arr[j]=arr[j+1];
          
          }
        }
       
      }
    for(i=0;i<n;i++)
     System.out.print(arr[i]+" ");
      
  }
}