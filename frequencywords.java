//WAP to find frequency of words in given string?
import java.util.*;
import java.lang.*;
public class frequencywords{
  public static void main(String args[]){
    Scanner h=new Scanner(System.in);
    int count=0;
    System.out.println("enter string: ");
    String s=h.nextLine();
    String a[]=s.split(" ");
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i].equals(a[j])){
          count++;
        }
      }
    }
    System.out.println("frequency of words in string: "+count);
  }
}