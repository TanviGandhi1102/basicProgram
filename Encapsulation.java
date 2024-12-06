package bacicsprograms;

 class Encapsulation_logic {
private String emailId="tanvi.khanduja@gmail.com";
private int age;
private long salary;
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getemailId() {
	return emailId;
}
public void setemailId(String emailid) {
	this.emailId=emailid;
}


public int getage() {
	return age;
}
public void setage(int age) {
	this.age=age;
}
}

public class Encapsulation{
	public static void main(String[] args) {
		Encapsulation_logic el=new Encapsulation_logic();
		el.setemailId("tanvikhanduja11@gmail.com");
		System.out.println(el.getemailId());
	}
	
}