import java.util.*;
//selectionsort on
class Selectionsort{
  public static void printArray(int arr[]){
      for(int h=0;h<arr.length;h++)
        System.out.println("elemnts in bubblesort array: "+arr[h]);
    }
  public static void main(String args[]){
    int arr[]={7,8,3,10,2};
    int temp=0;
    //Selectionsort begins
    for(int i=0;i<arr.length-1;i++){
      int small=i;
      System.out.println("no of iterations"+(i+1));
      for(int j=i+1;j<arr.length;j++){
        //swaps
        if(arr[small]>arr[j]){
          small=j;
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
      printArray(arr);
    }
  }
}