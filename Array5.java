//WAP to print reverse numbers in array?
import java.util.*;
public class Array5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,k,i;
    System.out.println("enter size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements into array");
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println("reverse elements in array ");
    for(k=n-1;k>=0;k--){
    System.out.println(arr[k]);
    }
  }
}
