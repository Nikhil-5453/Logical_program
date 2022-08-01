import java.util.*;
import java.lang.*;
public class Uni{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string:");
    String s=sc.nextLine();
    String ch[]=s.split(" ");
    System.out.println("Unique words in String are: ");
    for(int i=0;i<ch.length;i++){
      for(int j=i+1;j<ch.length;j++){
        if(ch[i].equals(ch[j])){
          ch[i]="\0";
          ch[j]="\0"; 
        }
        }
    }
      System.out.print("is: ");
      for(int k=0;k<ch.length;k++)
        System.out.print(ch[k]);
  }
}