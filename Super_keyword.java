package bacicsprograms;
import java.util.*;
class Parent_Method{
	void userinput() {
		 Scanner s1=new Scanner(System.in);
		 System.out.println("enter first number");
		 int a=s1.nextInt();
		 System.out.println("enter second number");
		 int b=s1.nextInt();
		 int sum=a+b;
		 System.out.println("sum of two number is "+sum);
		
	 }
}
public class Super_keyword extends  Parent_Method{
 
 void add(int a, int b) {
		super.userinput();
		
		
	}
public static void main(String[] args) {
	Super_keyword t=new Super_keyword();
	t.add(0, 0);
}

}


