package bacicsprograms;

import java.util.Date;

public class DateAssignment37 {
	public static void main(String[] args) {
		Date d1= new Date();
		//System.out.println(d1);
		String date=d1.toString();
		//present date
		System.out.println("current  date: "+date);
		String month=date.substring(4,7);
		String day=date.substring(0, 3);
		String date1=date.substring(8,10);
		System.out.println(day.concat(" ").concat(month).concat(" ").concat(date1));
	}
	
}
