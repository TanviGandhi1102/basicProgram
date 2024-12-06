package bacicsprograms;


public class This_calling_statement {
	This_calling_statement(){
		
		this(5,6);
		System.out.println("this constructor will call the second constrctor which will add two numbers int ");
		
	}
	
	This_calling_statement(int a , int b){
		this(50.3,69.3);
		int sum=a+b;
		System.out.println(sum);
		System.out.println("this constructor will call the second constrctor which will add two numbers double ");
	}
	
	This_calling_statement(double a, double b){
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new This_calling_statement ();
	}
}
