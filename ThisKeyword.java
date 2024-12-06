package bacicsprograms;

public class ThisKeyword {
int age;
String name;
void studentdtail(int age,String name) {
	this.age=age;
	this.name=name;
	System.out.println(age);
	System.out.println(name);
}

public static void main(String[] args) {
	ThisKeyword t=new ThisKeyword();
	t.studentdtail(45,"best");
}
}
