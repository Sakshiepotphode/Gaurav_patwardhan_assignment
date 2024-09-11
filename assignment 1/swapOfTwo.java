 

 public class swapOfTwo {

 // using Third Variable
 public static void main(String args[]) {
 System.out.println("using Third Variable");
 int x=200;
 int y=300;
 System.out.println("before");
 System.out.println("x"+x);
 System.out.println("y"+y);

 int temp=x;
 x=y;
 y=temp;
 System.out.println("After");
 System.out.println("x"+x);
 System.out.println("y"+y);


 // without using third variable
 System.out.println("Without using third variable");
 int a=200;
 int b=300;
 System.out.println("before");
 System.out.println("a"+a);
 System.out.println("b"+b);

 // a=b;
 b=a;
 System.out.println("After");
 System.out.println("a"+a);
 System.out.println("b"+b); 
 }
  }
