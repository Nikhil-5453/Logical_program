//WAP to print sum of all elements in array?
import java.util.*;
public class Array2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,i,sum=0;
    System.out.println("enter size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements into array");
    for(i=0;i<n;i++){
      arr[i]=sc.nextInt();
      sum=sum+arr[i];
    }
    System.out.println("sum of all elements in array: "+sum);
    
  }
}