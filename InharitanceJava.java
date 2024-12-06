package bacicsprograms;

class Parent{
	static void  add() 
	{
		
	}
	
	static void mul() {
		
	}
	
	void nonstatic() //this is a non static method 
	{
		
	}
	
	Parent(){
		System.out.println("parent constructor");
	}
}


public class InharitanceJava extends Parent

{
	static void sub() {
		
	}
	
	public static void main(String[] args) {
		add();
		
	/*	Parent p1= new Parent();
		p1.nonstatic();*/
		
		InharitanceJava in= new InharitanceJava();
		in.nonstatic();
		
	}
}
