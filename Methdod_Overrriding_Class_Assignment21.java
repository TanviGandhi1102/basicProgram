package bacicsprograms;

import java.util.Scanner;

abstract class User{
 abstract void login();	
}
class Admin extends User{
	void login() {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter your Admin credentials ");
		
	}
}
class Teacher extends User{
void login() {
		System.out.println("enter your teacher credential");
	}
}
class Student extends User{
void login() {

		System.out.println("enter your student id ");
	}
}
public class Methdod_Overrriding_Class_Assignment21 extends User {
	
	void login() {
		System.out.println("you have three log in portals : admin/teacher/student ");
	}
public static void main(String[] args) {
	
	
}
}
