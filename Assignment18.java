package bacicsprograms;
import java.util.*;

//calling a Parent class constructor from the base class using super keyword 
class Subject{
	Subject(int a,int b){
		Scanner s1= new Scanner(System.in);
		System.out.println("plase enter first number");
		 a= s1.nextInt();
		System.out.println("please neter the second number");
		 b=s1.nextInt();
		 int c=a+b;
		System.out.println("the sum of user givne input number:" + c);
	}
}



public class Assignment18 extends Subject {
	
	Assignment18(int a, int b){
		
		super(a,b);
	}
	
	public static void main(String[] args) {
		
		new Assignment18(0,0);
		
	}
}




