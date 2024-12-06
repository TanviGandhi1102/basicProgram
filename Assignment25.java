package bacicsprograms;

public class Assignment25 {
	
	
public static void main(String[] args) {
	String s1="i love myself";
	String reverse= "";
	System.out.println("length of the string :"+s1.length());
	System.out.println("uppercase string :"+s1.toUpperCase());
	System.out.println("lowercase string :"+s1.toLowerCase());
	System.out.println("trim the spaces from the string :"+s1.trim());
	

	
	for (int i=s1.length()-1;i>=0;i--) {
		char c1= s1.charAt(i);
		 reverse =reverse+c1;
	}
	System.out.println("revers of the string "+ reverse);
}
}
