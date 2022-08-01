//WAP to read scores for Project, External, Internal print Total 
//- Assign grades according to Total above 90 is A-grade.
//- Assign grades if a total above 70 is B-grade.
//- Assign grades if a total above 50 is C-grade.
//- also print if any subject failed.


import java.util.*;
class Score{
  public static void main(String args[]){
    Scanner e=new Scanner(System.in);
    System.out.println("enter Project,External,Internal");
    int P=e.nextInt();
    int E=e.nextInt();
    int I=e.nextInt();
    int t=0;
    if(P>=50 && I>=50 && E>=50){
      System.out.println("student got passed");
      int pr=(P*70)/100;
      int ex=(E*20)/100;
      int in=(I*10)/100;
      t=pr+ex+in;
      System.out.println("total score is:"+pr);
      System.out.println("total score is:"+ex);
      System.out.println("total score is:"+in);
      System.out.println("total score is:"+t);
    }
    if(t>=90){
      System.out.println("A grade");
    }
    else if(t>=70 && t<90){
      System.out.println("B grade");
    }
    else if(t>=50 && t<70){
      System.out.println("C grade");
    }
    else if(P<50){
      System.out.println("you failed in Project:"+P);
    }
    else if(E<50){
      System.out.println("you failed in External:"+E);
    }
    else if(I<50){
      System.out.println("you failed in Internal:"+I);
    }
    else{
      System.out.println(" ");
    }
    
  }
}