package bacicsprograms;

public class Assignment_14 {
public static void main(String[] args) {
	System.out.println("printing the value of i from 100 to 200 and  skipping 150");
	for(int i=100;i<=200;i++) {
		
		if(i==150) {
			continue;
		}
		System.out.println(i);
	}
	
}

}
