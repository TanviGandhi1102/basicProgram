package bacicsprograms;

public class Assignment6 {
	
 Assignment6(int a){
	 System.out.println("this is construcor1 with one int parameter "+a);
 }
 
 
 Assignment6(int a, int b){
	 System.out.println("this is construcor2 with 2 parameter "+a+"and" +b);
 }
 
 Assignment6(boolean a){
	 System.out.println("this is construcor3 with one boolean  parameter "+a);
 }
 
 public static void main(String[] args) {
	Assignment6 a6 = new Assignment6(1);
	new Assignment6(2,4);
	new Assignment6(true);
	
	
	
}
 
}
