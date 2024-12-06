package bacicsprograms;

public class AccessSpecifier_in_Class {
//method with default access specifer-- can be access
	static void add() {
		
	}
	
	static private void sub() {
		
	}
	
	static public void mul() {
		
	}
	
	static protected void div() {
		
		
	}
	
	public static void main(String[] args) {
		sub();
		mul();
		div();
		
	}
}
