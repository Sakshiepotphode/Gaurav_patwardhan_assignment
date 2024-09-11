package problem1;

import java.util.Scanner;
public class arithmaticOpe {
int a;
int b;

/**
 * 
 */
void setValues() {
a=5; 	b=4;
	}

public static void main(String args[]) {
arithmaticOpe obj = new arithmaticOpe();
Scanner sc = new Scanner(System.in);
obj.setValues();
System.out.println("Enter the two number");
System.out.println("Value of a"+obj.a);
int a =sc.nextInt();
System.out.println("Value of b"+obj.b);
int b= sc.nextInt();

//	1st Arithmatic Operation
//	Addition
System.out.println("Addition of two number ");
int sum = a+b;
System.out.println(sum);

//	2nd Arithmatic Operation
//	Subtraction
System.out.println("Subtraction of two number");
int sub=a-b;
System.out.println(sub);

//	3rd Arithmatic Operation
//	Multiplication
System.out.println("Multiplication of two number");
int mul=a*b;
System.out.println(mul);

//	4th Arithmatic Operation
//	Division
System.out.println("Division of two number");
int div=a/b;
System.out.println(div);


	}

}
