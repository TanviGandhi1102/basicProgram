package bacicsprograms;



class GrandParent{
	static void add() {
		
	}
}

class Parent1 extends GrandParent
{
	static void mul() {
}

}

public class Multilevel_Inharitance extends Parent1

{
 public static void main(String[] args) {
	mul();
	add();
	
}
	
	
	
	
}
