/*Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.
*/
  
import java.util.*;
class Stud{
  String Studentname;
  Stud(String i){
    Studentname=i;
  }
  void display(){
    if(Studentname==""){
    System.out.println("Student name is UNKNOWN");
    }
    else{
      System.out.println("Student name is: "+Studentname);
    }
  }
}
public class Student{
  public static void main(String args[]){
    Stud st=new Stud("Nikhil");
    Stud st1=new Stud("");
    st.display();
    st1.display();
  }
}