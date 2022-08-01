//WAP to rea number and print day : according to week number?

import java.util.Scanner;
class Raw{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    System.out.println("emter num");
    int num=n.nextInt();
    if(num==1){
      System.out.println("monday");
    }
    else if(num==2){
      System.out.println("tuesday");
    }
    else if(num==3){
      System.out.println("wenesday");
    }
    else if(num==4){
      System.out.println("thursday");
    }
    else if(num==5){
      System.out.println("friday");
    }
    else if(num==6){
      System.out.println("saturday");
    }
    else if(num==7){
      System.out.println("sunday");
    }
    else{
      System.out.println("Invalid number");
    }
            
    
  }
}