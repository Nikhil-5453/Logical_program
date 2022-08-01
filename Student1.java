/*	Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
  */


class Student1{
  String Name;
   int Roll_no;
  Student1(String i,int j){
  Name=i;
  Roll_no=j;
}
void credits(){
  System.out.println("Name and Roll-no of student is: "+Name+","+Roll_no);
}
  public static void main(String args[]){
    Student1 st=new Student1("jhon",2); 
    st.credits();
  }
}