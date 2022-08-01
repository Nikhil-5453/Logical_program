/*	Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
 */ 

class Student2{
  void display(){
    String Name="Sam";
    int roll_no=1;
    String phone="74163";
    String address="highschool raod";
    System.out.println("Name, roll_no, phone, Address of Student");
    System.out.println(Name+"     "+roll_no+"      "+phone+"     "+address);
  }
  void display2(){
    String Name="John";
    int roll_no=2;
    String phone="93937";
    String address="Beach raod";
    System.out.println("Name, roll_no, phone, Address of Student");
    System.out.println(Name+"     "+roll_no+"     "+phone+"     "+address);
  }
  public static void main(String args[]){
  Student2 st2=new Student2();
  st2.display();
    System.out.println();
    System.out.println();
  st2.display2();  
}
}