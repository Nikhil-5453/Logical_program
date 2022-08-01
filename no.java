import java.util.*;
public class no{
  public static void main(String args[]){
    Scanner h=new Scanner(System.in);
    String s=h.nextLine();
    String s1[]=s.split(" ");
    for(int i=0;i<s1.length;i++){
      System.out.println("words in given string: "+s1);
    }
  }
}