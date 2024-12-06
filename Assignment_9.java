package bacicsprograms;


//non static method overloading 
public class Assignment_9 {
	
	 
 void print(int a) {
	
	 System.out.println("you have called int method");
 }
void print(String a) {
	
	 System.out.println("you have called String method");
 }
void print(boolean a) {

	 System.out.println("you have called boolean");	 
}
public static void main(String[] args) {
	
	Assignment_9 s9= new Assignment_9();
	s9.print(0);
	s9.print(false);
	s9.print(null);
	
	
	
}
}
