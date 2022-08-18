class Bubblesort{
  public static void printArray(int arr[]){
      for(int h=0;h<arr.length;h++)
        System.out.println("elemnts in bubblesort array: "+arr[h]);
    }
  public static void main(String args[]){
    int arr[]={7,8,3,10,2};
    int temp=0;
    //bubblesort begins
    for(int i=0;i<arr.length-1;i++){
      System.out.println("no of iterations"+(i+1));
      for(int j=0;j<arr.length-i-1;j++){
        //swaps
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
      printArray(arr);
    }
  }
}