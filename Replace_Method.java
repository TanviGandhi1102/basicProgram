package bacicsprograms;

import java.util.Arrays;

public class Replace_Method {
public static void main(String[] args) {
	String s1= "TANVI khandh";
	System.out.println(s1.replaceAll("[a-z]", " "));
	
	//contains string function
	boolean b=s1.contains("ta");
	System.out.println(b);
	//..... we have to use the to match the charcaters .represent a character so with matched we chaeck if th string has these many character
	String a="tanvi";
	boolean b1=a.matches(".....");
	System.out.println(b1);
	//use multi character  in matches
	boolean b3=s1.matches("(.*)khand(.*)");
			System.out.println("b3" + b3);
	//ends with
			boolean b4=s1.endsWith("khandh");
			System.out.println("b4" + b4);
			
	//is empty
			boolean b5=s1.isEmpty();
			
	//split
			String str[]= s1.split(" ");
		
			System.out.println(Arrays.toString(str));
			
}
}
