package bacicsprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//learning upcasting 
public class CollectionProperty {
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(95);
		c1.add(89);
		System.out.println("c1 collection :"+c1);
		//storing values in collection
		Collection c2=new ArrayList();
		c2.add("Ram");
		c2.add(48);
		System.out.println("c2 collection:"+c2);
		
		//combining two collection
		System.out.println("added c1 in c2 and priniting c2:"+c2.addAll(c1));
		
		Collection c3=new ArrayList();
		c3.addAll(c2);
		System.out.println("c3 collection:"+c3);
		System.out.println("c2 collection:"+c2);
		System.out.println("check if c3 and c2 collections are equal :"+c3.equals(c2));
		//clear methods
		c1.clear();
		System.out.println("clear method has removed the objects from collection c1: "+c1);
		//remove object
		c2.remove(48);
		System.out.println("removed 48 from c2:"+c2);
		//remove collection
		c2.removeAll(c3);
		System.out.println(c2);
		//isEmpty
		System.out.println("to check if c2the collecton is empty:"+c2.isEmpty());
		System.out.println( "size of c2:"+c2.size());
		//iterator concept 
		Iterator i=c3.iterator();
		while(i.hasNext()){
		System.out.println( i.next());
		
	}

}
}
