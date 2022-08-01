/* WAP to check number s +ve,-ve,!zero*/

import java.util.*;
public class Check{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    /*System.out.println("enter number"); 
    int x= sc.nextInt();
    if((x!=0)&&(x>0)){
      System.out.println("number is postive and not zero");
    }
    else if((x!=0)&&(x<0)){
      System.out.println("number is negitive  and not zero");
    }
    else
      System.out.println("number is zero");
        
  }
}
=============================================
*/

    
/*WAP to check the character is Alphabet or not*/
 /* System.out.println("enter character");
    char ch= sc.next().charAt(0);
    if(ch>='a'&& ch<='z')
      System.out.println(ch+" is character");
    else if(ch>='A' && ch<='Z')
      System.out.println(ch+" is character");
    else
      System.out.println(ch+" is  not character");
  }
}
================================================
  */

/*WAP to check character is Uppercase or Lowercase*/
  /*System.out.println("enter character");
   Character ch= sc.next().charAt(0);
    if(Character.isUpperCase(ch))
      System.out.println(ch+" is Upper character");
    else if(Character.isLowerCase(ch))
      System.out.println(ch+" is Lower character");
    else 
      System.out.println(ch+" is not character");
===================================================== 
*/

    
//check number is palindrome or not
   /* int n=sc.nextInt(); //454
    int p=n;
    int r;
    int sum=0;
    while(n!=0){
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    System.out.println("reverse of number"+sum);
    if(p==sum)
    System.out.println("palindrome");
    else
      System.out.println("not palindrome");
//====================================================  


// find frequency of digits in given number
    /*System.out.println("enter number value for n");
    int n=sc.nextInt();
    for ()
================================================    
*/
   
//find first and last digits of number and their sum?
  int n=sc.nextInt();
    int firstdigit=0;
    int lastdigit=n%10;
    System.out.println("lastdigit of number: "+lastdigit);
    while(n!=0){
      firstdigit=n%10;
      n=n/10;
    }
    System.out.println("first digit is: "+firstdigit);
    System.out.println("sum of first and last digits: "+(firstdigit+lastdigit));

    //find sum of first and last digit of number
     
  }
  
}