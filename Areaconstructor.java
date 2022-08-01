/* 	Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
  */

import java.util.*;
class Dim1{
  int L;
  int B;
  
  Dim1(int i,int j){
    L=i;
    B=j;
  }
  void returnArea(){
    int Areaof=L*B;
    System.out.println("Area of Rectangle");
    System.out.println(Areaof);
  }
}
class Areaconstructor{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    System.out.println("enter length of rectangle");
    int i=sc.nextInt();
    System.out.println("enter breadth of rectangle");
    int j=sc.nextInt();
    Dim1 d=new Dim1(i,j);
    d.returnArea();
  }
}