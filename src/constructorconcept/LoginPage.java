package constructorconcept;

public class LoginPage {

	String userName;
	String password;

	public LoginPage(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public void login() {
		System.out.println("Enter your user nmae:" + userName);
		System.out.println("Enter your user nmae:" + password);
		System.out.println("Click on Login button");
		System.out.println("Login is done....");
	}

	public static void main(String[] args) {

		LoginPage lp1 = new LoginPage("Deepak", "deepak123");
		lp1.login();
		LoginPage lp2 = new LoginPage("ravi", "ravi234");
		lp2.login();
		

	}

}
