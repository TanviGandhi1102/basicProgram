package bacicsprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerclassCW {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("enter the size of your array");
	int rollno[]=new int[s1.nextInt()];
	System.out.println("enter the values of your array");
	for(int i=0;i<rollno.length;i++) {
		rollno[i]=s1.nextInt();
	}
	System.out.println(Arrays.toString(rollno));
}
}
