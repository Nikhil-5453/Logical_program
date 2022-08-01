//WAP to check given number is strong number or not.
// 145 ==> 1+24+120 ==> 145
import java.util.Scanner;
class U{

 public static void main(String args[]){

 Scanner s=new Scanner(System.in);

 System.out.println("Enter number to check it is strong number or not");
int num=s.nextInt(); // 145
int temp=num;
int rem=0,fact=1,sum=0;
    while(num!=0){
    rem=num%10; // 4
    for(int i=1;i<=rem;i++){
    fact=fact*i; // 1*2 2*3 =6*4= 24*5=120
   }
    sum=sum+fact; //120+24+1
    fact=1;
    num=num/10; //0
  }
if(sum==temp){
   System.out.println("Strong number");
 }
else{
   System.out.println("Not a strong number");
  }
}
}