//WAP to read units and generate bill?
//- first 50 units charge: 0.50/per unit.
//- next 100 units charge: 1.20/per unit.
//- above 150 units charge: 1.50/per unit.

import java.util.Scanner;
class Current{
  public static void main(String args[]){
    Scanner c=new Scanner(System.in);
    System.out.println("Enter no of units");
    int units=c.nextInt();
    double U=0, bill=0, paybill=0;
    if(units<=50){
      U= (units*0.50);
      bill= (U*10)/100;
      paybill=U+bill;
      System.out.print("your GST for units is:" +bill+ "pay: " +bill);
      System.out.print("your no of units is:" +units+ "pay: " +paybill);
    }
    else if(units>50 && units<=150){
      U= 50*0.50+(units-50)*1.20;
      bill= (U*10)/100;
      paybill=U+bill;
      System.out.print("your no of units is: " +units+ "pay: " +paybill);
    }
    else if(units>150){
      U= 50*0.50+100*1.20+(units-150)*1.50;
      bill= (U*10)/100;
      paybill=U+bill;
      System.out.println("your no of units is: " +units+ "pay: " +paybill);
    }
    else{
      System.out.println(" ");
    }
    
  }
}