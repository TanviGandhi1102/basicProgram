package bacicsprograms;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayProg {
public static void main(String[] args) {
	int rollnum[]=new int[5];
	
	rollnum[0]=85;
	rollnum[1]=85;
	for(int i=0;i<=4;i++) {
		rollnum[i]=i;
		rollnum[i]=rollnum[i]+1;
		System.out.println(rollnum[i]);
	}
	// toString menthod of class Array
	String name[]= new String[4];
	name[0]="apple";
	name[1]="ornage";
	name[2]="banana";
	name[3]="kiwi";
	System.out.println(Arrays.toString(name));
	
	//assigning the value of Array at runtime
     String name2[]=new String[4];
	Scanner s1=new Scanner(System.in);
	for (int i=0; i<name2.length;i++) {
		System.out.println("enter the value");
		name2[i]=s1.next();
		
	}
	System.out.println(Arrays.toString(name2));
	
	if(Arrays.equals(name, name2)) {
		System.out.println("arrays are equal");
	
	}
	else {
		System.out.println("arrays are not equal");
	}
	
}
}
