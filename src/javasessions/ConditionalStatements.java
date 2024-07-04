package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		if (true) {
			System.out.println("PASS");
		} else {// Dead code/Unreachable code
			System.out.println("FAIL");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("PASS");
		} else {// Dead code/Un reachable code
			System.out.println("FAIL");
		}
		
		int marks = 100;
		if(marks<=100) {
			System.out.println("Calculating grate");
			if(marks>=90) {
				System.out.println("Grade A");
				if(marks>=98) {
					System.out.println("Grade A++");
					if(marks==100) {
						System.out.println("Eligible for the scholership");
					}
				}
			}else {
				System.out.println("Grade B");
				
				if(marks<=50) {
					System.out.println("Grade C");
				}
			}
		}
		else {
			System.out.println("marks not valid");
		}
		
		
		//if-if-if-if-if-else --> Performance issue it gives launch chrome and says please pass the right browser
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch Chome");
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch firefox");
		}
		if(browser.equals("Edge")) {
			System.out.println("Launch Edge");
		}
		if(browser.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		else {
			System.out.println("Please pass the right browser name:" + browser);
		}
		
		//if-else if --> better than previous one as we have done error handling but have performance issue 
		
		String browser1 = "chrome";
		if(browser1.equals("chome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
			
		}else if (browser.equals("Edge")) {
			System.out.println("launch edge");
			
		}else if (browser.equals("Safari")) {
			System.out.println("launch safari");
			
		}
		else {
			System.out.println("Please pass the right browser name:" + browser);
		}

	}

}
