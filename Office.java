/*
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.

Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/

import java.util.*;
class Member{
  String Name;
  int Age;
  String Phonenumber;
  String Address;
  String Salary;
  void printsalary(){
    System.out.println("salary is "+Salary);
  }
}
class Employee extends Member{
  String Specialisation;
  String Dept;

Employee(String i,int j,String k,String l,String q,String h,String g){
  Name=i;
  Age=j;
  Phonenumber=k;
  Address=l;
  Specialisation=q;
  Dept=h;
  Salary=g;
  }
  void display(){
    System.out.println("Employee Name is "+Name);
    System.out.println("Age is "+Age);
    System.out.println("Phonenumber is "+Phonenumber);
    System.out.println("Address is "+Address);
    System.out.println("Specialisation is "+Specialisation);
    System.out.println("Dept is "+Dept); 
  }
  
}

class Manager extends Member{
  String Specialisation;
  String Dept;
 Manager(String a,int b,String c,String d,String e,String f,String aa){
  Name=a;
  Age=b;
  Phonenumber=c;
  Address=d;
  Specialisation=e;
  Dept=f;
   Salary=aa;
  }
  void display(){
    System.out.println("Manager Name is "+Name);
    System.out.println("Age is "+Age);
    System.out.println("Phonenumber is "+Phonenumber);
    System.out.println("Address is "+Address);
    System.out.println("Specialisation is "+Specialisation);
    System.out.println("Dept is "+Dept); 
    
  }
} 
class Office{
  public static void main(String args[]){
    Employee emp=new Employee("Nikhil",25,"466895","56/da","Developer","IT","25000");
    Manager man=new Manager("Jaswanth",35,"35468","39-A","Manager","HR","15000");
    emp.display();
    emp.printsalary();
    System.out.println();
    System.out.println();
    man.display();
    man.printsalary();
  }
}
