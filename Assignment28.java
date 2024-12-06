package bacicsprograms;

import java.util.Arrays;

public class Assignment28 {
//program to display array of boolean and double datatypes and display in array form.
	
	public static void main(String[] args) {
		boolean bool[]=new boolean[4];
		bool[0]= true;
		bool[1]= false;
		bool[2]= false;
		bool[3]= false;
		
		System.out.println(Arrays.toString(bool));
		
		double d[]=new double[3];
		d[0]=23.6;
		d[1]=6.9;
		d[2]=9.7;
		System.out.println(Arrays.toString(d));
	}
}
