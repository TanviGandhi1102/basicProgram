package bacicsprograms;

public class Method_Overloading_Practice {
void  sum(int a,int b) {
	int sum=a+b;
	
}
void sum(double a ,double b) {
	double sum=a+b;
	System.out.println(sum);
}
void sum(int a , double b) {
	double sum=a+b;
	System.out.println(sum);
}

void sum(double a, int b) {
	double sum=a+b;
	System.out.println(sum);
}
static void add(double d) {
	
}

static void add(float a) {
	System.out.println(a);
}
public static void main(String[] args) {
	Method_Overloading_Practice s1= new Method_Overloading_Practice();
	s1.sum(56.9, 8);
	add(6.23);
}
	


}
