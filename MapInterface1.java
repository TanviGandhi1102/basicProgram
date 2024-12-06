package bacicsprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.*;

public class MapInterface1 {
	public static void main(String[] args) {
		Map<String,Integer> m1= new HashMap<String,Integer> ();
		m1.put("Ramesh", 42);
		m1.put("Tanvi", 41);
		m1.put("Raga", 46);
		System.out.println(m1);
		
		//put to add one map in another
		Map<String,Integer> m2= new HashMap<String,Integer> ();
		m2.putAll(m1);
		//put adds only one key and value a a time
		m2.put("Yuv", 30);
		System.out.println(m2);
		
		//remove a particular object just pass the value of key it will remove the key and value together 
		m2.remove("Ramesh");
		System.out.println(m2);
		//replace
		m2.replace("Yuv", 1);
		System.out.println(m2);
		
		//creating a new map and storing name and gender in it 
		Map<String,Character> m3= new HashMap<String,Character> ();
		m3.put("Tanvi", 'F');
		m3.put("Bala", 'M');
		m3.put("Pallav", 'M');
		m3.put("Anil", 'M');
		m3.put("Raj", 'F');
		System.out.println(m3);
		//put if abscent--it checks if the value is not exisiting in he map and if not then it will add this value to the map
		m3.putIfAbsent("Palak", 'M');
		//just to access keys
	System.out.println(m3.keySet());
	//using for each loop, here we have created the string s1 based on our map m3's key type  if it would have been Integer they type if s
	
	for( String s1:m3.keySet()) {
		System.out.println(s1);
	}
	//if you want to get values
	System.out.println(m3.values());
	for(Character c1:m3.values()) {
		System.out.println(c1);
	}
 for( Entry<String, Character> e2: m3.entrySet()) {
	 System.out.println(e2);
 }
	
	
	
	
		
	}
}
