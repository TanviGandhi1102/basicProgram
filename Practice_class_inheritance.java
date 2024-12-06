package bacicsprograms;

abstract class inharitParent{
	abstract void login();
	 void logout() {
		System.out.println("this method is called in the child class using super keyword");
	}
	 static void changepassword() {
		 System.out.println("change password called directkly from the child class using method name");
	 }
	 inharitParent(){
		 System.out.println("super class constaructor");
	 }
}
public class Practice_class_inheritance extends inharitParent {

	
	void login() {
	
		System.out.println("overriding the non static method named login from the  paret class" );
		super.logout();
	}
	
	Practice_class_inheritance(){
		this(0,0);
		System.out.println("hello-construction will be called by default as you have made he object of the calss because condtrctor are the non satic methods"
				+ "");
		
		
	}
	
Practice_class_inheritance(int a , int b){
	System.out.println("world");
	}
public static void main(String[] args) {
	Practice_class_inheritance p1=new Practice_class_inheritance();
	p1.login();
	changepassword();
	
	
	
}
}
