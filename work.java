import java.util.*;
public class work{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

// 1) WAP print numbers from 1 to 10?
    /*for(int i=1;i<=10;i++)
      System.out.println("numbers from 1 to 10"+i);
//=====================================================

// 2) WAP calculate the sum of first 10 natural number?
    int sum=0;
    for(int i=1;i<=10;i++)
      sum=sum+i;
      System.out.println("sum of numbers "+sum); 
//=====================================================

// 3) WAP print the multiplication table of that number?
    System.out.println("enter n value for table");
    int n=sc.nextInt();
    for (int i=1;i<=10;i++)
      System.out.println("multplication table of "+n+" * "+i+" = "+(n*i)); 
//======================================================

// 4) WAP find the factorial value of any number?
    System.out.println("enter n value for factorial");
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++)
      fact=fact*i;
     System.out.println("factorial of number: "+fact);  
     */
//======================================================

// 5) WAP reverse the given number?
    /*System.out.println("enter n value to reverse");
    int n=sc.nextInt();
    int rev=0,r;
    int p=n;
    while(n!=0){ //321
    r=n%10;
    rev=(rev*10)+r;
    n=n/10;
    }
    System.out.println("Reverse of given number: "+rev); 
    */
//=======================================================

// 6) WAP print Fibonacci series of n terms where n is input by user :0 1 1 2 3 5 
      //8 13 24 ..... 

 /*int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
   
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;   
  System.out.print(" "+n3);    
  n1=n2;  
  n2=n3;   
 } 
//=========================================================

// 7) WAP calculate the sum of following series where n is input by user. 
      //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 

    /*
    System.out.println("enter n value");
    int n=sc.nextInt();
    double i,sum=0.0;
    for( i=1;i<=n;i++){
      sum=sum+1/i; //1+1/2+1/3
      System.out.println("series 1/"+(int)i);
    }
      System.out.print("Sum is "+sum);
    */
//==========================================================

// 9) WAP to find frequency of each digit in a given integer?
       /* int number,i,count=0,digit,temp;
        System.out.println("Enter any Number : ");
        number=sc.nextInt(); //545356
         System.out.println("Digit Frequency");
       for(i=0;i<=9;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"       "+count);
            }
        }
           */
    
//==========================================================
    
// 10) WAP to find power of a number using for loop?

   System.out.println("enter number");
    int n=sc.nextInt(); //2
    System.out.println("enter exponential");
    int j=sc.nextInt();  //5
    int result=1;
    for (;j!=0;--j){
      result=result*n;  //1*2=2
    }
    System.out.println("result is "+result);
  
//==========================================================
    
// 11) WAP to print alphabets from a to z?
    /*char ch= sc.next().charAt(0);
    while(ch<='z'){
      System.out.print(ch+" ");
      ch++;
    */
    //}
      
  }
}