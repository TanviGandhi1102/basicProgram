package bacicsprograms;

import java.util.Scanner;

//multilevel inheritence in Class 
class G_Parent{
	//static method
	
	static void add(int a ,int b) {
		int sum=a+b;
		System.out.println("sum of two numbers"+sum);
	}
	static void multiply(int a , int b) {
		int multiply=a*b;
		System.out.println("multiplication of two numbers"+multiply);
	}
	static void subtract(int a,int b) {
		int sub=a-b;
		System.out.println("subtarction of two number"+sub);
	}
}
class P_Parent extends G_Parent{
	//non static method
	
	void mod(int a, int b) {
		int mod=a%b;
		System.out.println("modulous"+mod);
		
	}
	
	void divide(int a,int b) {
		int div=a/b;
		System.out.println("division"+div);
	}
}
public class Assignment17  extends P_Parent{
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter a number1");
	int a=s1.nextInt();
	System.out.println("please ener number 2");
	int b=s1.nextInt();
	Assignment17 a17= new Assignment17();
	add(a,b);
	a17.divide(a, b);
	a17.mod(a, b);
	subtract(a, b);
     multiply(a, b);
	
	
}
}
