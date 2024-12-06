package bacicsprograms;


//method overloading- addition function on different data types
public class Assignment_7 {

	static void  add(int a, int b) {
		int result=a+b;
		System.out.println("sum of int numbers:--"+result);
	}
	
	static void  add(double a, double b) {
		double result=a+b;
		System.out.println("sum of double numbers:--"+result);
		
	}
	
	static void  add(float a, float b) {
		float result=a+b;
		System.out.println("sum of float numbers:--"+result);
		
	}
	
	static void  add(String a, String b) {
		//String result= a.concat(b);
		String result= a+b;
		System.out.println("doing "+" on  twwo string:--  "+result);
		
	}
	
	public static void main(String[] args) {
		add(8,5);
		add(8.5,9.5);
		add(80.56,96.3);
		add("automation_","calss_48");
		
	}
}
