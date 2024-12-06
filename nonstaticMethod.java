package bacicsprograms;

public class nonstaticMethod {

	void nonstaticmenthod() {
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		nonstaticMethod n1= new nonstaticMethod ();
		n1.nonstaticmenthod();
	}
	
	
	
}
