package bacicsprograms;

import java.util.Scanner;

public class Assignment11 {

 public static void main(String[] args) {
	 Scanner s1= new Scanner(System.in);
	 System.out.println("please enter your name ");
	 String studentname=s1.nextLine();
	 System.out.println("please enter the name of the college");
	 String name=s1.nextLine();
	 System.out.println("please enter the name of the branch");
	 String branch=s1.nextLine();
	 System.out.println("please enter the name of the ID");
	 int id=s1.nextInt();
	 System.out.println("please enter the name of the phone number");
	 long ph=s1.nextLong();
	 System.out.println("\n");
	 System.out.println( "Student Name:"+studentname+"\n"+"college name:"+name+"\n"+"Branch:"+branch+"\n"+"Student ID:"+id+"\n"+"phone number:"+ph);
}


}
