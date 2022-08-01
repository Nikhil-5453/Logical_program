/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {
  
//main method
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
//declare int type variable
    int a;
    System.out.println("enter number");
//take input from user
    a=sc.nextInt();
//converting integer to string using toString method
    String s=Integer.toString(a);
//use inbuilt function to print index position
    char ch=s.charAt(2);
//print result
    System.out.print("Char at index position-2 in string is: "+ch);
  }
}