package bacicsprograms;
import java.util.*;
public class ListPropertiesAssignment40 {
	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> l2= new ArrayList<Integer>();
		l2.add(11);
		l2.add(12);
		l2.add(13);
		//add all
		l1.addAll(l2);
		//printing collection
		System.out.println("l2"+l2);
		System.out.println("l1"+l1);
		//check if l1 contains l2
		boolean b=l1.containsAll(l2);
		
		System.out.println("does l1 contains l2"+ b);
		//remove l2 from l1
		l1.remove(l2);
		l1.removeAll(l2);
		System.out.println("removing l2 from l1"+l1);
		//clear l2
		l2.clear();
		System.out.println("clear out the object fro l2"+l2);
		//iterator 
		Iterator<Integer> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println("Iterator: "+ i1.next());
			
		}
		
		//List iterator 
		ListIterator<Integer> i2=l1.listIterator();
				while(i2.hasNext()) {
					System.out.println("ListIterator: "+i2.next());
					
				}
	}

   
}
