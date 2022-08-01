//WAP to find no of vowels in string?
import java.util.*;
public class vowels{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    int count=0;
    int i,j;
    System.out.println("enter String");
    String s2=sc.nextLine();
    System.out.println("String in s2: "+s2);
    for(i=0;i<s2.length();i++){
      if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
        count++;
    }
    System.out.println("no of vowels in string: "+count);
  }
}