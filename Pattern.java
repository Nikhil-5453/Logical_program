 /* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

public class Pattern{
  public static void main(String[] args)
   {
      int a, b, x, y;
      int rows = 5;
      for(a = 1; a <= rows; a++)
      {
         if(a % 2 == 0)
         {
            x = 1;
            y = 0;
         }
         else
         {
            x = 0;
            y = 1;
         }
         for(b = 1; b <= a; b++)
         {
            if(b % 2 == 0)
            {
               System.out.print(x);
            }
            else
            {
               System.out.print(y);
            }
         }
         System.out.println("");
      }
   }
}

//Add main method here

//Declare variable n and initialize value as 5

//Check whether the i and j are equal or not using for loop

//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero