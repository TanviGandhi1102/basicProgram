	package bacicsprograms;
	
	
	public class Assignment27 {
	//check if he given number is palindrome or not
		
		public static void main(String[] args) {
			String Palindrome="rotator";
			//reverse a string 
			char c[]=Palindrome.toCharArray();
			String reverse="";
			for(int i=Palindrome.length()-1;i>=0;i--) {
				reverse=reverse+c[i];
			}
			System.out.println(reverse);
			if(Palindrome.equals(reverse)) {
				System.out.println("it is  palendrome string ");
			}
			else {
				System.out.println("not a palendrome");
			}
		
		String s1="Java";
		String s2="java";
		//check if two strings are equal 
		System.out.println("are both the string equal:  "+s1.equals(s2));
		
		
		
		//trim
		String test=" A Very Good Morning ! ";
		System.out.println(test.trim());
		
		}
		
	}
