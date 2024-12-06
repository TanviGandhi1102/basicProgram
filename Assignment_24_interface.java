package bacicsprograms;

interface Int1{
	 void login(); //by default the method is public
}

interface Int2{
	 void logout() ;//by default the method is public
}
public class Assignment_24_interface implements Int1,Int2{
	public static void main(String[] args) {
		Assignment_24_interface s1= new Assignment_24_interface();
		s1.login();
		s1.logout();
	}
	
		public void login(){
			System.out.println("interface 1- function login");	
		}
		
		public void logout(){
			System.out.println("interface 2 function logout");
		}
	

}
