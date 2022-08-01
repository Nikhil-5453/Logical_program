//WAP to print duplicate words in given string?
import java.util.*;
import java.lang.*;
public class dup{
  public static void main(String a[]){
    Scanner g=new Scanner(System.in);
    char x=' ';
    System.out.println("enter String:");
    String s=g.nextLine();
    char[] d=s.toCharArray();
    System.out.println("given string: "+s);
    for(int i=0;i<d.length;i++){
      int count=1;
      for(int j=i+1;j--){
        if(d[i]==d[j]){
          count++;

        }
      }
    }
  }
}