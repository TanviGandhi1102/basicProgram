package bacicsprograms;

public class Assignment5 {
//nested if
	public static void main(String[] args) {
		int age=20;
		double weight=68;
		
		if(age>18) {
			if(weight>55) {
				System.out.println("you can donate blood");
			}
			
			else {
				System.out.println("sorry you can not donate the blood");
				
			}
		}
		
		else {
			System.out.println("sorry you can not donate the blood");
			
		}
	}
	
}
