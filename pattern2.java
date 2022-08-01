/*WAP print pattern
*
**
***
****
*****
*/

import java.util.*;
public class pattern2
  {
    public static void main(String args[])
    {
    /*1
      1 2
      1 2 3
      1 2 3 4
    */
      
     int i, j; 
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number of rows");
      n=sc.nextInt();
        for(i=1;i<=n;i++)
            {           
              System.out.print(" ");
             for(j=1; j<=i; j++)
              {       
                System.out.print(j+"  ");
               }           
             System.out.println();
            } 
    */

    /*    int n,i,j;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter no of rows ");
      n=sc.nextInt();
      for(i=n;i>=1;i--){
        System.out.println("");
        for(j=1;j<=i;j++){
          System.out.print(i);
        }
        System.out.println();
        
      }
      */
      
    }
  }