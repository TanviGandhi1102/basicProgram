package bacicsprograms;

public class CallingMethods {
	
	static void Print1() {
		System.out.println(" this is a static menthod Print1" );
	}
	
static void Print2() {
	System.out.println(" this is a static menthod Print2");	
	}
	
static void Print3() {
	System.out.println(" this is a static menthod Print3");
}

 void Print4() {
	 System.out.println(" this is a non static menthod Print4");
}

void Print5() {
	System.out.println(" this is a static non menthod Print5");
}

	
	public static void main(String[] args) {
		Print1();
		Print2();
		Print3();
		CallingMethods cm = new CallingMethods();
		cm.Print4();
		cm.Print5();
		
		
	}

}
