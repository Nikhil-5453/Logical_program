import java.util.*;
public class trianglesinarray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,j;
    System.out.println("enter size for row");
    int r=sc.nextInt();
    System.out.println("enter size for coloumn");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("enter elements array");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Upper Triangle in array/matrix");
    /*
    * 2 3
    * * 6
    * * * 
      */
    
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
       if(i>=j){
         System.out.print("* ");
       }
        else{
          System.out.print(arr[i][j]+" ");
        }
      }
       System.out.println();
    }
    
    System.out.println("///////////////////////");
    System.out.println("lower triangle in array/matrix");
    /*
    * * * 
    4 * *
    7 8 *
      */
    
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
       if(i<=j){
         System.out.print("* ");
       }
        else{
          System.out.print(arr[i][j]+" ");
        }
      }
       System.out.println();
    }
    
  }
}