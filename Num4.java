import java.util.*;
class Num4{
  public static void main(String args[]){
    Scanner b=new Scanner(System.in);
    System.out.println("enter number");
    int n=b.nextInt();
    int num=n;
    int r, rev=0;
    while(n>0){
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    if(num==rev){
      System.out.println("your number is "+rev+ " palindrome.");
    }
    else{
      System.out.println("your number is "+rev+ "not palindrome.");
    }
  }
}  