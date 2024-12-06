package bacicsprograms;


public class Automation {
	
	Automation(){
 System.out.println("this is my first constructor1 ");
}
	
	
	Automation(int a){
		 System.out.println("this is my first constructor2 ");
	}
	
	//constructor overloading 
	public static void main(String[] args) {
		Automation a1= new Automation();
		Automation a2= new Automation(100);
	}
	
}