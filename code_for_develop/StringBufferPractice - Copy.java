package practice;

public class StringBufferPractice {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	sb.append("learning core java concept");
	sb.setLength(10);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.reverse());
	System.out.println(sb.reverse());
	sb.replace(9, 12, "selenium");
	System.out.println(sb.capacity());
	System.out.println(sb);
	sb.insert(sb.length(), "for automaion web");
	System.out.println(sb.capacity());
	System.out.println(sb);
	sb.insert(sb.length()-17, " ");
	System.out.println(sb.capacity());
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	sb.substring(0);
	System.out.println(sb.substring(0));
	StringBuffer sb2=new StringBuffer("test");
	System.out.println(sb2);
	
	StringBuffer sb3=new StringBuffer("test");
	System.out.println(sb2);
	boolean b=sb3.equals(sb2);
	System.out.println(b);
	if(sb2!=sb3) {
		System.out.println("hello");
	}
	sb2=sb3;
	if(sb2==sb3 && sb2.equals(sb3)) {
		System.out.println("world");
	}
	sb2.ensureCapacity(1);
	boolean t=sb2.equals(sb3);
	System.out.println(b);
	String s=sb2.toString();
	String y=sb3.toString();
	System.out.println(s+y);
	if(s.equals(y)) {
		System.out.println("now they will chek for refrence and since it will point to same refence they are equal");
	}
	
	sb2.replace(0, 1, "B");
	System.out.println(sb2);
	sb2.delete(0, 1);
	System.out.println(sb2);
	
	String m="test";
	String p="test";
	boolean b2= m==p;
	System.out.println(b2);
	
	StringBuffer sbt = new StringBuffer("Java12");

	sbt.delete(1, 5);
    
	System.out.println(sbt); 
	
	
	StringBuffer sbr = new StringBuffer("Hello World");
	sbr.replace(6, 11, "Java");
	System.out.println(sbr);
	StringBuffer del = new StringBuffer("Hello");
	System.out.println(del.delete(1, 3));
	System.out.println(del);
	del.replace(1, 2, "ell");
	System.out.println(del);
	String t4="hello";
     t4.substring(1, 2);
     System.out.println(t4.substring(1, 2));
     
     StringBuffer sb5 = new StringBuffer("Hello World");
     sb5.deleteCharAt(6);
     System.out.println(sb5);
     
}
}