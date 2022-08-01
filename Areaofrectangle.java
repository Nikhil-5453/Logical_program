/* Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/
  

import java.util.*;
class Area{
  int L;
  int B;
  int Areaof;
  void setDim(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length for rectangle");
    L=sc.nextInt();
    System.out.println("enter breadth for rectangle");
    B=sc.nextInt();
    getArea();
  }
  void getArea(){
    Areaof=L*B;
    System.out.println("Area of Rectangle: "+Areaof);
  }
}
public class Areaofrectangle extends Area{
  public static void main(String args[]){
    Area d=new Area();
    d.setDim();
   
    
  }
}