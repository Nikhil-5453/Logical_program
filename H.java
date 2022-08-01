import java.util.*;
public class H{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int i =0;
      int num =0;
    int rev=0;
      System.out.println("Enter the value of n:");
      int n = s.nextInt();
      for (i = 1; i <= n; i++) //i<30 	   
      { 		 		  
         int count=0; 		  
         for(num =i; num>=1; num--) //30<1 -->
         {
	    if(i%num==0) //1/30
	    {
		count = count + 1;
        
	    }
	 }
	 if (count ==2)
	 {
	    //Appended the Prime number to the String
	    //primeNumbers = primeNumbers + i + " ";	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(i);
     System.out.println(" ");
    /*if(flag)
      System.out.print(count+" prime number");
    else
      System.out.print(count+" not prime number");*/
   }
  }
}
}