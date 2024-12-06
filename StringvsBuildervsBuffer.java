package bacicsprograms;

public class StringvsBuildervsBuffer {
public static void main(String[] args) {
	String a="automation";
	a.concat("testing");
	System.out.println(a);
	//String Buffer is mutable  it is a con
	StringBuffer b= new StringBuffer("api");
	b.append("  testing");
	System.out.println(b);
	// StringBuilder sb1=new StringBuilder();
	b.insert(11, "QA");
	 System.out.println(b);
	 //delete mentod
	 b.delete(11,13);
	 System.out.println(b);
	 
	 //replace 
	b.replace(0, 3, "automation");
	 System.out.println("replace api : " +b);
	 
	 StringBuffer b1= new StringBuffer();
b1.append("testing automation selenium");
System.out.println(b1);

	
			
}
}
