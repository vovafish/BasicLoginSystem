package main;

public class Main {
	
	public static void main(String[] args) {
		IDandPassword idandpassword = new IDandPassword();
		
		LoginPage loginpage = new LoginPage(idandpassword.getLoginInfo());
	}
}
