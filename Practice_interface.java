package bacicsprograms;

import java.util.Scanner;

interface intface1{
	 void apple();
	void banana();
	
}
public class Practice_interface implements intface1 {

	@Override
	public void apple() {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter about apple");
		String ap=s1.next();
		System.out.println(ap);
		
	}

	@Override
	public void banana() {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter about banana");
		String ap=s1.next();
		System.out.println(ap);
		
		
	}

}
