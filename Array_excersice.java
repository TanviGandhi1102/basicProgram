package bacicsprograms;

public class Array_excersice {
public static void main(String[] args) {
	int ar[]=new int[5];
	ar[0]=79;
	ar[1]=81;
	ar[2]=54;
	ar[3]=34;
	ar[4]=40;
	int numbercheck=34;
	for (int i=0;i<=4;i++) {
		if(ar[i]==numbercheck) {
			System.out.println("34 is present at index"+ i);
		}
		
			
	}
	
}
}
