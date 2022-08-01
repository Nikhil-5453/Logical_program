/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.*;

public class Palindrome {
//main method
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
//declare varible
    String d="";
    String k="";
//take input from user
    System.out.println("enter String");
    d=sc.nextLine();
    int g=d.length();
    for(int i=0;i<=g-1;i++)
      {
        k=k+d.charAt(i);
      }
    if(d.equalsIgnoreCase(k))
      System.out.println(" Malayalam is palindrome");
    else
      System.out.println(" Malayalam is not palindrome");
    

}
}


/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/


