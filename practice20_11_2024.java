package bacicsprograms;

import java.util.Arrays;

public class practice20_11_2024 {
public static void main(String[] args) {
	int a=18;
	String gender ="female";
	if(a>18 && gender=="female") {
	System.out.println("you can vote");
}
	else {
	System.out.println("you can not vote");
}
	String test="Tanvi @@@@ K Gandhi";
	System.out.println(test.length());
	System.out.println(test.substring(test.length()-6));
	String str[]=test.split(" ");
	System.out.println(Arrays.toString(str));
	System.out.println(test.indexOf('T'));
	System.out.println(test.charAt(0));
	
	
}
}