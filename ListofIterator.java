package bacicsprograms;
import java.util.*;
public class ListofIterator {
	
	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add("APPLE");
		l1.add("APPLE1");
		l1.add("APPLE");
		l1.add("APPLE");
		l1.add("APPLE");
		l1.add(25);
		l1.add(null);
		//creating a list of string type
		List<String> l2= new ArrayList<String>();
		Iterator l3=l1.listIterator();
		Iterator l4=l1.listIterator();
		
		Set s1=new HashSet();
		s1.add(1);
		s1.add("test");
		s1.add(null);
		System.out.println(s1);
		Iterator s2=s1.iterator();
		
	}

	


}
