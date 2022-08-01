//WAP to print elements diagnoal inn array or matrix?
import java.util.*;
public class DiagonalArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,j;
    System.out.println("enter rows size for array");
    int r=sc.nextInt();
    System.out.println("enter coloumns size for array");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("enter vlaues to array");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        arr[i][j]=sc.nextInt();
      }
    }

    System.out.println("diagonal elements in array from left to right");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        if(i==j){
          System.out.print(arr[i][j]+" ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
    System.out.println("diagonal elements in array from right to left");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        if((i+j)==(r-1)){
          System.out.print(arr[i][j]+" ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}