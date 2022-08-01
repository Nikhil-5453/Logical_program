/*
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call

1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
*/

class parent{
   void display(){
    System.out.println(" this is parent class");
  }
}
class child extends parent{
  void done(){
    System.out.println(" this is child class");
  }
  public static void main(String args[]){
    parent a=new parent();
     child b=new child();
    a.display();
    b.done();
    b.display();
    
}
}