package bacicsprograms;
//abstraction concept--a class haveing 2 abstract and 2 concrete method

abstract class baseclass23{
	abstract void login();
	static void logout(){
		System.out.println("click on the log out button and you can exit the application");
	}
	static void feedback() {
		System.out.println("share you rthoughts about the app, please rate the app");
	}
}
public class Student_Assignment23 extends baseclass23{

	
	void login() {
		System.out.println("login successful");
		super.logout();
		super.feedback();
		
	}
	public static void main(String[] args) {
		Student_Assignment23 s23=new Student_Assignment23();
		s23.login();
	}

}
