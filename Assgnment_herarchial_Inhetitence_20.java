package bacicsprograms;
class Class_Spuer{
	static void print1() {
		System.out.println("calling print method of classsuper");
	}
}

class Class_Sub1 extends Class_Spuer{
	static void print2() {
		System.out.println("calling print method of class_sub1");
	}
}

class Class_Sub2 extends Class_Spuer{
	static void print3() {
		System.out.println("calling print method of classs_sub3");
	}
}

//  Assgnment_herarchial_Inhetitence_20,Class_Sub1,Class_Sub2, extends from classs_super- hierarchial level inheritance 

public class Assgnment_herarchial_Inhetitence_20 extends Class_Spuer{
	public static void main(String[] args) {
		print1();
		
	}

}
