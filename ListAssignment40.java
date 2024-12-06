package bacicsprograms;

import java.util.ArrayList;
import java.util.List;

public class ListAssignment40 {
	public static void main(String[] args) {
		List l1= new ArrayList();
		//add method
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1);
		//add all method 
		List l2= new ArrayList();
		l2.addAll(l1);
		System.out.println(l2);
		//contains
		boolean b=l2.containsAll(l1);
		System.out.println(b);
		//is empty
		boolean e=l2.isEmpty();
		System.out.println(e);
		//addlast
		l2.addLast(6);
		System.out.println(l2);
		//addfirst
		l1.addFirst(0);
		System.out.println(l1);
		//
	}



}
