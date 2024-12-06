package bacicsprograms;

import java.util.Scanner;

class Parent16{
	static void add() {//static method of a parent 16 class
		System.out.println("you are calling a menthod to add numbers your are requested to add to numbers next");
		Scanner s1= new Scanner (System.in);
		System.out.println("\n"+"enter first number");
		int a= s1.nextInt();
		System.out.println("\n"+"enter second number");
		int b= s1.nextInt();
		int c= a+b;
		System.out.println("\n"+"sum of the above is "+c);
	
	}
	/*Parent16(){// constructor of calss parent 16
		System.out.println("this is a parent class non parameterized constructor  which is called from the child class using super");
	}*/
}
public class Assignment16 extends Parent16 {
public static void main(String[] args) {
   
	add();
	//Assignment16 a16= new Assignment16();
	
}
}
