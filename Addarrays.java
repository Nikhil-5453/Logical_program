import java.util.*;
public class Addarrays{
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
    System.out.println("enter vlaues to array1");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        arr1[i][j]=sc.nextInt();
      }
    }
System.out.println();
    System.out.println("elements in array");
    for(i=0;i<r;i++){
       for(j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("elements in array1");
    for(i=0;i<r;i++){
       for(j=0;j<c;j++){
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
    int d[][]=new int[r][c];
    /*for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        d[i][j]=arr[i][j]+arr1[i][j];
      }
    }
    System.out.println("elements in array after ADDITION");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print(d[i][j]+" ");
      }
      System.out.println();
    }*/
//==========================================================
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        d[i][j]+=arr[i][j]*arr1[j][i];
      }
    }
    System.out.println("=======================================");
    System.out.println("elements in new array after PRODUCT: ");
     for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print(d[i][j]+" ");
      }
       System.out.println();
    }
  }
}