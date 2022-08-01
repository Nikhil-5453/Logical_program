import java.util.*;
public class TransposeArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,j;
    System.out.println("enter rows size for array");
    int r=sc.nextInt();
    System.out.println("enter coloumns size for array");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int arr1[][]=new int[r][c];
    System.out.println("enter vlaues to array");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("elments in array");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
      }
       System.out.println();
    }
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        arr1[j][i]=arr[i][j];
      }
    }
    System.out.println("elments in transpose array");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
  }
}