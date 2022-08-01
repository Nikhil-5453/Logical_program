import java.util.*;
public class non{
  public static void main(String args[]){
    String s="abcdefghih";
    for(int i=0;i<s.length();i++){
      if(s.indexOf(i)==s.lastIndexOf(i)){
        System.out.println("first non-reapting character is: "+i);
        break;
      }
      else{
        System.out.println("there is no non-reapting character");
      }
    }
  }
}