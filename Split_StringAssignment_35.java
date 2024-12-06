package bacicsprograms;

import java.util.Arrays;

public class Split_StringAssignment_35 {
	public static void main(String[] args) {
		String s1="Java is fun";
		String s2="Java Python C++";
		String s3="Java is fun to learn";
		int countWords=0;
		//converting string in to character array
		char c[]=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		//converting string in to string array
		String str[]=s1.split(" ");
		System.out.println(Arrays.toString(str));
		//split s3 in three parts
		String str1[]=s3.split(" ", 3);
		System.out.println(Arrays.toString(str1));
		//split string using a comma
		String str2[]=s2.replaceAll(" ", ",").split(",");
		System.out.println(Arrays.toString(str2));
		for(int i=0;i<str2.length;i++) {
			countWords++;
			System.out.println("word at index "+i+" is: "+str[i]);
		}
		System.out.println("total words in the string Java is fun is:"+ countWords);
	}

}
