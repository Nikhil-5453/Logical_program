/*WAP pattern
  
    *
   **
  ***
 ****
*****
  */

import java.util.*;
public class pattern3
  {
    public static void main(String args[])
    {
      
      int i,j; 
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      n=sc.nextInt();

      System.out.println(" ");
        
        for (i=0; i<n; i++)
          { 
            for(int k=1;k<=(n-i); ++k)
              System.out.print(" ");
              for (j=0; j<=i; j++ )
                { 
                   //System.out.print(" ");
                   System.out.print("*");
                } 
              System.out.println();
            } 
    }
}