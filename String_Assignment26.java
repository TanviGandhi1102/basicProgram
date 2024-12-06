package bacicsprograms;

public class String_Assignment26 {
public static void main(String[] args) {
	String a1="Welcome India";
	System.out.println("index of given character 'c' in the string \"Welcome India\":" +a1.indexOf('c'));
	
	String str="Programmin";
	System.out.println("in the given string 'Programmin' the character at index 4 is :"+ str.charAt(4));
	
	String str1="Hello";
	String str2="World";
	System.out.println("concatination on string 1 and string 2:"+ str.concat(str2));
	
	
	String name="Welcome to Java Programming";
	System.out.println("extracting a substring from \"Welcome to Java Programming\" from index 11 till the end of the string: "+ name.substring(11, name.length()));
	
	String p1="Programming if Fun";
	System.out.println("extract a substring from 0 to 11 in \"Programmin if Fun\":" + p1.substring(0, 11));
}
}
