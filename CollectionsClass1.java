package bacicsprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClass1 {
public static void main(String[] args) {
	/*List cs= new ArrayList();

	cs.add("Aditya");
	cs.add("Adharsh");
	cs.add("Harini");
	cs.add("Hitesha");
	cs.add("Tanvi");
	System.out.println(cs);
	//Collections.reverse(cs);
	System.out.println(cs);
	List s=Collections.emptyList();
	System.out.println(s);
	
	Collections.replaceAll(cs, "Aditya", "Best ");
	Collections.sort(cs);
	System.out.println(cs);*/
	
	List<Integer> int1=new ArrayList<Integer>();
	int1.add(1);
	int1.add(2);
	int1.add(11);
	int1.add(101);
	int1.add(201);
	int1.add(5);
	System.out.println(int1);
	
	for(Integer i: int1){
		System.out.println(i);
	}
	
	System.out.println("get first method: "+int1.getFirst());
	System.out.println("minimum number : "+Collections.min(int1));
	
	System.out.println("max : "+Collections.max(int1));
	
	
	List<Integer> int2=new ArrayList<Integer>();
	int2.add(18);
	int2.add(26);
	int2.add(113);
	int2.add(111);
	int2.add(2);
	int2.add(50);
	
	Collection c1= new ArrayList();
	c1.add(1);
	c1.add(2);
	Collection c2= new ArrayList();
	c1.add(0);
	c1.add(25);
	
	
}

}
