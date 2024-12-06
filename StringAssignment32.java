package bacicsprograms;

public class StringAssignment32 {
//use of equals and equalsingorecase
//usage of contains() method
	
	public static void main(String[] args) {
		String s1="java";
		String s2="Java";
		String test="Getting hands-on with Java is fun";
		System.out.println("when compared with euals() mentod:"+s1.equals(s2));
		System.out.println("when compared with eualsignorecase() mentod:"+s1.equalsIgnoreCase(s2));
		boolean b=test.contains("Java");
		System.out.println("is the given string contains Java:"+b);
	
	}
	
}
