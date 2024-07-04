package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		//byte, short, int, String, char

		String browser = "chrome";
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "Edge":
			System.out.println("launch Edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("Please pass right browser: " + browser);
			break;
		}
		
		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is e vowel");
			break;
		case 'i':
			System.out.println(ch + " is i vowel");
			break;
		case 'o':
			System.out.println(ch + " is o vowel");
			break;
		case 'u':
			System.out.println(ch + " is u vowel");
			break;
		default:
			System.out.println(ch + " is u Consonent");
			break;
		}
		

	//use cases
	//1. multiple env: Dev, QA, Stage, UAT, Prod
	//2. Cross browser
	//3. RBAC(RollBaseAccessControl): Admin, vendor, partner, custoemr, 
	//4. Payment methods: cards, paypal, UIP, bank transfer
	//5. no of months/weeks
	//6. Blood group
	//7. 
	
	//vowels: a e i o u
	
	}

}
