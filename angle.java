class angle{
  int a;
  int b;
  int c;
  angle(){
    a=3;
    b=4;
    c=5;
  }
  double Area(){
    double s=(a+b+c)/2;
    double B=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return B;
  }
  double perii(){
    double p=(a+b+c);
    return p;
    
  }
  public static void main(String args[]){
    angle t=new angle();
    System.out.println("Area of triangle"+t.Area());
    System.out.println("perimeter of triangle"+t.perii());
  }
}