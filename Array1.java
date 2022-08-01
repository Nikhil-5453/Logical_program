//WAP to find max and min elements in array?
import java.util.*;
public class Array1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,i,k,min,max,count=0,count1=0;
    System.out.println("enter size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter array elemnts");
    for(i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
      min=max=arr[0];
      for(k=1;k<=n-1;k++){
        if(min>arr[k]){
          min=arr[k];
          count++;
        }
        if(max<arr[k]){
          max=arr[k];
          count1++;
        }
    }
    System.out.println("minimum value in array "+min);
    System.out.println("no of minimum value in array "+count);
    System.out.println("maximum value in array "+max);
    System.out.println("no of maximum value in array "+count1);
  }
}