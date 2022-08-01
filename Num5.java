//WAP to print sum of digits in number?

import java.util.*;  
class Num5  
{
  public static void main(String a[])  
  {  
    int d, n, sum = 0;  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the number: ");  
    n = sc.nextInt();  
    while(n!=0)  
    {
      d=n%10;   
      sum+=d;  
      n=n/10;  
    }    
    System.out.println("Sum of Digits: "+sum);  
  }  
}