package bacicsprograms;

public class GlobalVariable {
	
	static int a =100;
	static int b=200;
	int c;
	
	static void add () {
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	static void sum() {
		int Sub=a-b;
		System.out.println(Sub);
	}
	
	
	
	
public static void main(String[] args) {
	add();
	sum();
	//a=1;
	GlobalVariable gb = new GlobalVariable ();
	gb.c=300;
	
	System.out.println(gb.c+a);
}





}
