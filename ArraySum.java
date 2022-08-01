/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;

public class ArraySum {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int sum=0;
    System.out.println("enter size for array:n ");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements to array");
    for (int i=0;i<n;i++){
      arr[i]=s.nextInt();
      sum=sum+arr[i];
    }
     System.out.println("total of array elements: "+sum);
  }

//Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
