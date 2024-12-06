package bacicsprograms;

public class EmployeeDetails_19 {
	
	EmployeeDetails_19(String empname){
		this("tanvi",121);
		System.out.println(empname);
	}
	EmployeeDetails_19(String name, int id){
		System.out.println(name+id);
	}
	public static void main(String[] args) {
		new EmployeeDetails_19("tanvi");
	}
}
