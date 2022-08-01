//WAP to find Midvalue in given array?
import java.util.*;
import java.lang.*;
public class midvalue{
  public static void main(String args[]){
    Scanner h=new Scanner(System.in);
    int mid=0,start,last;
    System.out.println("enter size for array");
    int n=h.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=h.nextInt();
    }
    System.out.println("midvalue in array");
    for(int i=0;i<=arr.length-1;i++){
      start=0;
      last=arr.length-1;
     mid=(start+last)/2;
      }
    System.out.println(arr[mid]);
    
  }
}