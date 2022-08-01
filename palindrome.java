//WAP to print palindrome numbers from 1-100?
import java.util.*;
import java.util.*;
public class palindrome{
  public static void main(String args[]){
    int N,n=0;
    int r=0,sum=0;
    int temp=0;
    int i;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter number ");
     N=sc.nextInt();
    System.out.println("palindrome numbers from 1-100");
    for(i=1;i<=N;i++){
      n=i;
      while(n>0){
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
      
    if(sum==i){
      System.out.println(i+" ");
    }
    sum=0;
    }
  }
  
}