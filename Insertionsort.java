class Insertionsort{
  public static void main(String args[]){
     int arr[]={85,12,49,51,73,81,64};
  for(int j=1;j<=arr.length-1;j++){
   int key=arr[j]; 
    int i=j-1;                   //i=index(0);
                //key=12;
  while((i>=0)&&(key<arr[i])){    //(85>12);
    arr[i+1]=arr[i];                   ////85,12 --> 85,85;;  i=index(1);
    i--;                               //i=index(0);
  }
  arr[i+1]=key;
  }
    for(int i:arr)
      System.out.print(i+" ");
  }
}