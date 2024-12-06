package bacicsprograms;

import java.util.Scanner;

//super keyword to use super class method in child class 
class SuperClass{
	void login(String name) {
		System.out.println("you are in the super class method");
	}
	
	static void sum() {
		System.out.println("static method calling from  directly no need super keword");
	}
	public SuperClass(int a ,int b) {
		System.out.println("you are in the super class constructor");
	}
}

public class Superkeyword_Assignment22 extends SuperClass{
	
void logout() {
	Scanner s1= new Scanner(System.in);
	System.out.println("enter a name to call super call method");
	super.login(s1.next());
	
}
Superkeyword_Assignment22(){
	super(5,6);
}

	public static void main(String[] args) {
		
		Superkeyword_Assignment22 s22=new Superkeyword_Assignment22();
	s22.logout();
	sum();
}
}
