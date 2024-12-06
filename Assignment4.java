package bacicsprograms;

public class Assignment4 {
	
	
	//grading system
	public static void main(String[] args) {
		int score=90;
		
		
		if ( score>=90 && score<=100) {
			System.out.println("you got greade A+");
			
		}
		else if( score>=80 && score<=90) {
			System.out.println("you got greade A");
		}
		else if( score>=60 && score<=70) {
			System.out.println("you got greade B");
		}
		else if( score>=50 && score<=60) {
			System.out.println("you got greade C");
		}
	
		else if( score<50) {
			System.out.println(" Please try again! FAIL");
		}
	
	
	
	}
	
	
			

}
