package bacicsprograms;

import java.util.Date;

public class Date_Class {
public static void main(String[] args) {
	Date d1= new Date();
	//System.out.println(d1);
	String date=d1.toString();
	//present date
	System.out.println("current  date: "+date);
	//System.out.println(d1.getTime());
   //fuure date
	Date fdate= new Date(d1.getTime()+(1000*60*60*24*1));
	System.out.println("future date: "+fdate);
	//past date
	
	Date pdate= new Date(d1.getTime()-(1000*60*60*24*1));
	System.out.println("past date: "+pdate);
}
}
