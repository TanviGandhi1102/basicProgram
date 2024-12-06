package bacicsprograms;

public class ExceptionCW {

	public static void main(String[] args) {
	try {
		int c=1/0;
	}
	
	catch (ArithmeticException a) {
		System.out.println("you have not entered the correct value hence the exception came");
	}
	finally {
		System.out.println("finally block");
	}
}
}