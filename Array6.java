//WAP to copy all elements of one to another array?
import java.util.*;
public class Array6{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    int n,m,k,i,j;
    System.out.println("enter size of array1");
    n=sc.nextInt();
    System.out.println("enter size of array2");
    m=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[m];
    System.out.println("enter elements into array");
    for(i=0;i<n;i++){
      arr1[i]=sc.nextInt();
      for(j=i;j<n;j++){
        arr2[j]=arr1[i];
      }
    }
    System.out.println("elements in array2");
    for(k=0;k<m;k++)
    System.out.print(arr2[k]+" ");
  }
}

 
