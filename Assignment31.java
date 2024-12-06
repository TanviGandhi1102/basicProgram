package bacicsprograms;

import java.util.Arrays;

public class Assignment31 {
//check if the strings are anagram
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(s1.length()==s2.length()) {
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			
			if(Arrays.equals(c1, c2)==true) {
				System.out.println("given strings are anagram");
			}
		}
		else {
		System.out.println("given strings are not an anagram");
	}
}
}
