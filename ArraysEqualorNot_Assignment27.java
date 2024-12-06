package bacicsprograms;
import java.util.*;
public class ArraysEqualorNot_Assignment27 {
	static int counter=0;
	public static void main(String[] args) {
		String s1="KV no 2 banglore";
		String s2="Karnataka";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		//to check if two arrays are equal or not 
		if(s1.length()==s2.length()) {
			for (int i=0;i< s1.length();i++) {
				if(c1[i]==c2[i]) {
					counter++;
				}
			}	
			if(counter==s1.length()) {
				System.out.println("the string is equal");
			}
			else{
				System.out.println("input strings are not equal");
			}
		}
		else {
			System.out.println("input strings are not equal");
		}
		
		
	}

}
