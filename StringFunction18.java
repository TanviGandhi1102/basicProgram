package bacicsprograms;

public class StringFunction18 {
public static void main(String[] args) {
	String a="Tanvi Gandhi";
	System.out.println("lenth of Tanvi is "+a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.charAt(4));
	System.out.println(a.indexOf('a'));
	System.out.println(a.concat("K").concat(" Gandhi"));
	System.out.println(a.equals("Tanvi"));//return type is boolean
	System.out.println(a.substring(1));//substring
	System.out.println(a.substring(6, 12));
	
	
	
	//reverse a string
	String pd ="wow";
	System.out.println("reversing a string");
	 String reverse = "";
	 for(int i= pd.length()-1; i>=0;i--) {
		 char c1= pd.charAt(i);
		 reverse =reverse+c1;
	 }
	System.out.println(reverse);
	
	
	
	//palindrome
	
	if(pd.equals(reverse)) {
		System.out.println("palendrome");
	}
	else {
		System.out.println("not palendrome");
		 
		
		
	}
	int a1=11, b1=2;
	if (a1>=b1) {
		System.out.println(" a is greater than or equal to b");
	}
	else {
		System.out.println("false");
	}
	
}
}