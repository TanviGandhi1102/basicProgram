package bacicsprograms;



class AbsParent{
	void login() {
		System.out.println("log in with mobile");
	}
}
public class Abstract extends AbsParent {

	void login() {
		super.login();
		System.out.println("log in with id");
	}
	
	
	public static void main(String[] args) 
	{
		
	  Abstract a= new Abstract();
	  a.login();
			  
	}

}
