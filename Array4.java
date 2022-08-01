//WAP to print total no of negative numbers in array?
import java.util.*;
public class Array4{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,k,i,count=0;
    System.out.println("enter size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements into array");
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(k=0;k<n;k++)
      {
        if(arr[k]<0){
          count++;
        }
      }
    System.out.println("no of negative numbers: "+count);
  }
}
