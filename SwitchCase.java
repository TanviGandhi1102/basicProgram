package bacicsprograms;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("enter the value");
	int result=s1.nextInt();
	
	switch(result) {
	case 18: System.out.println("you can vote");
	break;
	case 8: System.out.println("you can not vote");
	default : System.out.println("you have not entered a valid input please try again later");
	}
	
}


}
