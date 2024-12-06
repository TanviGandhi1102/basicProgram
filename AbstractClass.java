package bacicsprograms;

 abstract class ClassB{
	abstract  void login();
	abstract void logout();
	static void auth() {
		System.out.println();
	}
}
 
 public class AbstractClass extends ClassB {
	 void login(){
		 System.out.println("this mentod is overrifden ");
	 }
	 void logout() {
		 System.out.println("this is a logic to logout and this method is overridden ");
	 }
	 
	 public static void main(String[] args) {
		
		
	}
 }
 