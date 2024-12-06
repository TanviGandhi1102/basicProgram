package bacicsprograms;

import java.util.Date;

public class DateFunction {
	public static void main(String[] args) {
		Date d1=new Date();	
		System.out.println(d1.getTime());
		//to print it in a beter format conver string
		String s1= d1.toString();
		System.out.println(s1);
		String date=s1.substring(8, 10);
		System.out.println(date);
		
		Date d2=new Date(d1.getTime());
	}


}
