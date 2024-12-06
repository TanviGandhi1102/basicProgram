package bacicsprograms;

import java.util.*;


/* using the name of the calss as Assignment19-
using *this() statement to perform  
constructor chaining  when Assignment19 class will  have diffrent parameters  */

public class Assignment19 {
	static String Empname;
	static int Empid;
	static String Empcompany;
	static String Empdesig;
	static long Empsalary;
	
	Assignment19(String name,int id){
		
		this(Empcompany,Empdesig);
		System.out.println("Employee name is:"+ Empname );
		System.out.println("Employee Id is:"+ Empid );
	    
}
	
	

Assignment19(String company,String desig){
this(Empsalary);
System.out.println("Employee Company name is:"+ Empcompany );
System.out.println("Employee designation is:"+ Empdesig );
	
	
}

Assignment19(long salary){
	System.out.println("Employee salary is:"+ Empsalary );
}




public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter he employee details");
	System.out.println("enter name");
	Empname=s1.next();
	System.out.println("enter emp id");
	 Empid=s1.nextInt();
	 System.out.println("enter Employee company");
     Empcompany=s1.next();
     System.out.println("enter he employee designation");
	 Empdesig=s1.next();
	 System.out.println("enter he employee salary");
	 Empsalary=s1.nextLong();
	
	new Assignment19(Empname,Empid);
	
}
}
