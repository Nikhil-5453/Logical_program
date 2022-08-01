//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

import java.util.*;

public class Percentage {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the total marks :");
    double total_marks= sc.nextInt();
    System.out.print("Enter maximum marks possible :"); 
    double max_marks=sc.nextInt(); 
    double P=(total_marks/max_marks)*100+1;
    System.out.println("your percentage is= "+(int)P);

    }

}