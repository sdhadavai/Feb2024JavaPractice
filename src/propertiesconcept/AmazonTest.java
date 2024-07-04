package propertiesconcept;

import java.util.Properties;

public class AmazonTest {

	public static void main(String[] args) {

		PropReader reader = new PropReader();
		Properties prop = reader.initProperteis();
		String browserName = prop.getProperty("browser");
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Choem is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "firefox":
			System.out.println("firefox is launched");
			break;

		default:
			System.out.println("Please enter right browser");
			break;
		}
		
		System.out.println(prop.getProperty("url"));
		System.out.println("Enter username: " + prop.getProperty("username"));
		System.out.println("Enter username: " + prop.getProperty("password"));
		System.out.println("Click on Login button");

	}

}
