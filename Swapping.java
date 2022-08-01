/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
  int a=sc.nextInt();//50
  int b=sc.nextInt();//25
    a=a+b;//50+25=75
    b=a-b;//75-25=50
    a=a-b;//75-50=25
  System.out.println("values are: "+a+ " and "+b);
  }

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//swapping two numbers without using third variable

//print result

}