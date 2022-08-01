/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2    2 3 4
  Elements  [1,2] : 3    1 2 3
  Elements  [1,3] : 4    4 5 6
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
     int i,j,r,c;
    System.out.println("Enter Rows of Matrix");
    r=sc.nextInt();
    System.out.println("Enter Cloumns of Matrix");
    c=sc.nextInt();
  int arr[][]=new int[r][c];
  for(i=1;i<=r;i++){
   for(j=1; j<=c;j++)  
     {  
       System.out.print("Enter Array Elements"+"["+i+","+j+"]"+": ");
       arr[i][j]=sc.nextInt();  

       }   
  }
int trans[][]=new int[r][c];
   for(i=0;i<=r;i++){    
       for(j=0;j<=c;j++){    
            trans[j][i]=arr[i][j];  
           }    
      }  
  System.out.println("---------Output--------");
System.out.println("After Transpose Matrix:");  
for(i=1;i<=r;i++){    
for(j=1;j<=c;j++){    
System.out.print(trans[i][j]+" ");    
}  
  System.out.println();
}
}
}

//Define the main method

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j