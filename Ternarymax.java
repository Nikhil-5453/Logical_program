import java.util.Scanner;

public class HighestNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter numbers");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int max;
    max= (x>y)?(x>z ? x:z):(y>z? y:z);
    System.out.println("Greatest number among "+x+ "," +y+ " and " +z+ " is " +max);
    
    
  } 
}