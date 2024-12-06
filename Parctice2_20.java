package bacicsprograms;
import java.util.Scanner;
public class Parctice2_20 {
public static void main(String[] args) {
	
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter a string");
	
	String input;
	input=s1.next();
	System.out.println(input.toCharArray());
	System.out.println(input.length());
	char t1[]= input.toCharArray();
	String reverse="";
	for(int i=input.length()-1;i>=0;i--) {
		//System.out.println("inside loop");
	reverse=reverse+t1[i];
	}
	System.out.println("value of"+reverse);
	if(input.equalsIgnoreCase(reverse)) {
		System.out.println("palendrome string");
	}else {
		System.out.println("not a palendrome string");
	}
}
}
