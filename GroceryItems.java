/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,max;
    
    System.out.println("enter size of array: ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter values into array: ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    max=arr[0];
    for(int i=0;i<n;i++){
      if(max<arr[i]){
        max=arr[i];
      }
    }
    System.out.println("highest price: "+max);
  }

//Define the main method

//Declare and initialize variables

//Take the 10 different expenses price

//Check the 10 different expenses price using for loop

//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.

//Print the result
//Take the 10 different expenses price

//Check the 10 different expenses price using for loop

//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.

//Print the result
}


