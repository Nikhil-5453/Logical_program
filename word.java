//WAP to find no of words in String?
import java.util.*;
import java.lang.*;
public class word{
  public static void main(String args[]){
    Scanner h=new Scanner(System.in);
    System.out.println("enter string");
    String a=h.nextLine();
    int count=1;
    for(int i=0;i<=a.length()-1;i++){
      if((a.charAt(i)==' ')&&(a.charAt(i+1)!=' '))
        {
          count++;
      }
    }
    System.out.println("string is: "+a);
    System.out.println("no of words in string "+count);
  }
}