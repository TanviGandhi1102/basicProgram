package bacicsprograms;

import java.util.Scanner;

public class Assignment12 {
 final static double  a =Math.PI;// a is a global variable which is also final 
 static int radius;// radius is a global variable 
 
 static void area() {
	 Scanner s1= new Scanner(System.in);
	 System.out.println("Enter the vaue of the raidus to calculate the area of a circle");
	  radius=s1.nextInt();
	 double result= radius *radius*a;// result is a local variable 
	 System.out.println("Area of a circle is: "+ result);
 }
 
 public static void main(String[] args) {
	area();
	
}
}
