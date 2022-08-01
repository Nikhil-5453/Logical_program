class I{
  public static void main(String args[]){
    String s="fbenfbhetfiqe dfbqehfbq  ";
    String s1="123ekwey3z";
    String s2=new String("hiew");
    String s3=new String("HiEw");
    System.out.println("Replace the value with given string: "+s1.replace('e',"aa"));
    System.out.println("Replace the value with given string: "+s1.replaceAll("ek","ab"));
    System.out.println("Replacing all values in string: "+s1.replace('3','7'));
    System.out.println("=================");
    System.out.println("substring os string: "+s.substring(2, 6)); //2=e, 6=h
    System.out.println("triming of string: "+s.trim());
    String s6[char j[s1]];
    System.out.println("split of String: "+s6.split('w'));
    System.out.println("char at string index: "+s1.charAt(3));
    System.out.println("length os string: "+s2.length());
    System.out.println("comparing two strings: "+s2.compareTo(s3));
    System.out.println("comparing two strings: "+s3.compareTo(s2));
    System.out.println("concating two strings: "+s3.concat(s1));
    String s5;
    System.out.println(s5.toString(50));
  }
}

public class I{
  public static void main(String args[]){ 
    String str = "hai hai".replace('a', "oo");
    System.out.println(str);
  } 
}*/




    
//WAP to find all bulit-in methods in StringBuffer class?
  StringBuffer s=new StringBuffer("welcome");
    String u="Nikhil";
    s.append(u);
    System.out.println("append value of s: "+s);
    s.append("babu");
    System.out.println("append value of s: "+s);
    s.insert(1,"j");
    System.out.println("insert value of s: "+s);
    s.reverse();
    System.out.println("reverse value of s: "+s);
    s.replace(3,5,"bb");
    s.delete(2,4);
     System.out.println("delete value of s: "+s);
    
  }
}

  