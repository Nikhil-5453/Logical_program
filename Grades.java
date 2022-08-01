import java.util.*;

public class Grades{
  public static void main(String args[]){
    Scanner H=new Scanner(System.in);
    System.out.println("Enter 5 marks....");
    int m1=H.nextInt();
    int m2=H.nextInt();
    int m3=H.nextInt();
    int m4=H.nextInt();
    int m5=H.nextInt();
    int total_marks=(m1+m2+m3+m4+m5);
    int max_marks=500;
    int P=(total_marks/max_marks)*100+1;
    if(P>90)
      System.out.println(((int)P+" Grade-A");
    else if(P>=80 && P<=90)
      System.out.println((int)P+" Grade-B");
    else if(P>=70 && P<=80)
      System.out.println((int)P+" Grade-C");
    else if(P>=60 && P<=70)
      System.out.println((int)P+" Grade-D");
    else if(P>=50 && P<=60)
      System.out.println((int)P+" Grade-E");
    else if(P>=40 && P<=50)
      System.out.println((int)P+"F ");
    else if(P<40)
      System.out.println((int)P+"Fail");
    else
      System.out.println((int)P+" N ");
    
  }
}