package bacicsprograms;

public class Assignment30 {
//string function
	
	public static void main(String[] args) {
		String test="Hello! 123@ jAvA_";
		//a) Number of alphabets used
		int countalphabets=0;
		int countdigit=0;
		int countspecialchar=0;
		int countspace=0;
		char c[]=test.toCharArray();
		
		for(int i=0;i<test.length()-1;i++) {
			//a) Number of alphabets used
			boolean b=Character.isAlphabetic(c[i]);
			if(b==true) {
				countalphabets++;
			}
			//a) Number of digit used
			boolean n=Character.isDigit(c[i]);
					if(n==true) {
						 countdigit++;
					}
					//a) Number of spaces used		
			boolean sp=Character.isSpaceChar(c[i]);
			if(sp==true) {
				countspace++;
			}
			
		}
		//a) Number of special character used
		countspecialchar=test.length()-(countalphabets+countdigit+countspace);
		System.out.println("In the given String the count of alphabets: "+countalphabets);
		System.out.println("In the given String the count of  digits: "+countdigit);
		System.out.println("In the given String the count of special character: "+countspecialchar);
		System.out.println("In the given String the count of spaces: "+countspace);
	}
}
