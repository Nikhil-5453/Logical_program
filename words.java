//WAP to find no of words in given string?
import java.util.*;
import java.lang.*;
public class words{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    int count=1;
    System.out.println("enter string");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
        count++;
      }
    }
    System.out.println("given string is: "+s);
    System.out.println("no of words in String: "+count);
  }
}