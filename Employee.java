package bacicsprograms;

public class Employee {
	
	Employee(String name){
		 System.out.println("Employee Name: "+name);
	 }
	 
	 
	Employee(int id){
		 System.out.println("Employee ID: "+id);
	 }
	 
	Employee(String company, String desig ){
		 System.out.println("Company Name:"+ company +'\n' + "Designation:"+" "+ desig);
	 }
	 
	Employee(long salary ){
		 System.out.println("Salay: "+ salary);
	 }
	 
	
	 public static void main(String[] args) {
		 Employee e1 = new Employee("Alex");
		new Employee(1111);
		new Employee("ABC Corp","QA Engineneer");
		new Employee(10000000l);
		
	}
	 

}
