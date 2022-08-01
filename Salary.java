import java.util.*;

public class Salary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter basic");
    int basic=sc.nextInt();
    int HRA;
    int DA;
    double Gross;
    if(basic<=10000){
      HRA=(basic/100)*20;
      DA=(basic/100)*80;
      Gross= basic+HRA+DA;
      System.out.println("HRA, DA "+HRA+" AND "+DA);
      System.out.println("Gross salary is "+Gross);
    }
  }
}
    
    