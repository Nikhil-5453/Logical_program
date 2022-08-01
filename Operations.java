/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x=a-b;
    System.out.println("Difference of 2 numbers: "+x);
    System.out.println("enter values");
    int c=sc.nextInt();
    int d=sc.nextInt();
    int y=c*d;
    System.out.println("product of 2 numbers: "+y);
    System.out.println("enter values");
    int e=sc.nextInt();
    int f=sc.nextInt();
    int z= e/f;
    System.out.println("Division of 2 numbers: "+z);
    System.out.println("enter values");
    int g=sc.nextInt();
    int w=++g;
    int v=--g;
    System.out.println("Increment of numbers: "+w);
    System.out.println("Decrement ofnumbers: "+v);
    System.out.println("enter values");
    int h=sc.nextInt();
    int i=sc.nextInt();
    int s=h%i;
    System.out.println("Remainder of 2 numbers: "+s);
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

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}