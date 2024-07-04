package oopabstract;

public class LoginPage extends Page {
	
	int timeOut = 5;
	
	public LoginPage(){
		System.out.println("LoginPage Default Constructor");
	}
	
	public LoginPage(int a){
		System.out.println("LoginPage one Param... Constructor " + a);
	}
	
	public LoginPage(int a, int b){
		System.out.println("LoginPage two Param... Constructor " + a + b);
	}

	@Override
	public void title() {
		System.out.println("Login Page Title");

	}

	@Override
	public void url() {
		System.out.println("Login Page URL");
	}
	
	
	
	public void doLogin(String un, String pwd) {
		System.out.println("User is logged with:" + un + pwd);
	}

}
