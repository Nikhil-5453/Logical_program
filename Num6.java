import java.util.*;
class Num6{

 public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number");
    int n=sc.nextInt();
    int sum=0,temp,fact,i;
    temp=n;
    while(n>0)
      {
        fact=1;
        i=1;
        int r=n%10;
        while(i<=r)
          {
            fact=fact*i;
            i++;
          }
        sum+=fact;
        n/=10;
      }
    if(temp==sum)
    {
      System.out.println(temp+" is a strong number");
    }
    else
    {
      System.out.println(temp+" is not a strong number");
    }
 }
}