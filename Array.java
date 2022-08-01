///WAP to copy all elements form one array to another array?

import java.util.*;
class copy{
  public static void main(String args[]){
    int n,m,i,j;
    System.out.println("enter size for first array");
    n=sc.nextInt();
    System.out.println("enter size for second array");
    m=sc.nextInt();
    int arr[]=new int[n];
    int arr1[]=new int[m];
    System.out.println("enter elements into first array");
    for(i=0;i<=n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter elements into second array");
    for(j=0;j<=m;j++){
      arr1[j]=sc.nextInt();
    }
  }
}