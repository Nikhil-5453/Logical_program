//JFM1T3_Assignment3:
/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.

  Sample Input:
       character=M

  Expected Output:
      ASCII value of M is:77

*/

import java.util.Scanner;

public class Unicode {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter character(ch)");
    char ch = scanner.next().charAt(0);  
    int Ascii = ch;
    System.out.println("Ascii value of "+ch+" is:" +Ascii);
    }
}