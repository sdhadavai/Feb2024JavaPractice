package dynamicarrays;

import java.util.HashMap;
import java.util.Map;

public class UserApp {
	
	public static String getUserCreds(String role) {
		
		
		Map<String, String> userRole = new HashMap<String, String>();
		userRole.put("admin", "admin;admin");
		userRole.put("seller", "seller@gmail.com;seller@123");
		userRole.put("vendor", "vendor@gmail.com;vendor@123");
		userRole.put("customer", "customer@gmail.com;customer@123");
		userRole.put("Catmanager", "cat@gmail.com;cat@123");
		
		return userRole.get(role);
		
	}
	
	public static void doLogin(String uName, String pwd) {
		System.out.println("Logged in with: " + uName + " " + pwd);
		
	}

	public static void main(String[] args) {

		String creds = getUserCreds("vendor");
		System.out.println(creds);
		String[] cred = creds.split(";");
		String userName = cred[0];
		String password = cred[1];
		doLogin(userName,password);
		

	}

}
