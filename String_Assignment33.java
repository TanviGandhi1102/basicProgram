package bacicsprograms;

public class String_Assignment33 {
//replace method usage
	
	public static void main(String[] args) {
		String s1="Hello! 123Bye 789";
		//replace all numbers with blank space
		System.out.println(s1.replaceAll("[0-9]", " "));
		//replace captial leter with blank space
		System.out.println("replcae Capital letters :"+s1.replaceAll("[A-Z]", ""));
		System.out.println("replcae Small letters :"+s1.replaceAll("[a-z]", ""));
		//replace letter e with y
		System.out.println("replacing e with y:"+s1.replace("e", "y"));
		//replace numeric characters
		System.out.println("replacing digits:"+s1.replaceAll("[0-9]", ""));
	}
}
