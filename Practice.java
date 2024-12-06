package bacicsprograms;

import java.util.Arrays;

public class Practice {

	static String s6="";
public static void main(String[] args) {
	String s1="Hitesha";
	String s2="Tanvi";
	int count=0;
	String s3= new String("Veena Reddy             ");
	String s4=new String("Asha");
	s1=s2;
	
	System.out.println(s1==s2);
	System.out.println(s3!=s4);
	System.out.println(s3.trim());
	System.out.println(s3.indexOf('e'));
	char array[]= s3.toCharArray();
	for(int i=0;i<s3.length();i++) {
		if(array[i]=='e') {
			count++;
		}
	
	}
	String s5[]=s3.split(" ");
	
	System.out.println(Arrays.toString(array));
	System.out.println(count);
	System.out.println(s6.isEmpty());

}
}
