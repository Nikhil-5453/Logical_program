/*	Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.
  */


class Dim{
  int L;
  int B;
  Dim(int i, int j){
    L=i;
    B=j;
  }
  int Area(){
    int Areaof=L*B;
    System.out.println("AreaofRectangle");
     return Areaof;
  }
}
class AreaofRectangle2{
  public static void main(String args[]){
    Dim d=new Dim(4,5);
    Dim d1=new Dim(5,8);
    int A=d.Area();
     System.out.println(A);
    int A1=d1.Area();
     System.out.println(A1);
  }
}