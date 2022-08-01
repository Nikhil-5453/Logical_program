//Wap tp print Reverse of Number?

import java.util.*;
class Num3{
  public static void main(String args[]){
    Scanner b=new Scanner(System.in);
    System.out.println("enter number");
    int n=b.nextInt();
    int r, rev=0;
    while(n>0){
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    System.out.println("your reverse number is: "+rev);
  }
}  