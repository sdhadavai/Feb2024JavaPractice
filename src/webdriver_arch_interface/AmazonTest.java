package webdriver_arch_interface;

import exceptionhandling.MyException;

public class AmazonTest {

	public static void main(String[] args) {

		
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browserName = "Fire  FOX";
		WebDriver driver = null;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser");
			throw new MyException("BROWSER NOT FOUND");
			
		}
		
		driver.get("https://amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is not correct");
		}
		
		driver.findElement("amazon logo");
		driver.sendKeys("emailId", "sri@gmail.com");
		driver.sendKeys("password", "sri@1234");
		driver.click("loginbutton");
		driver.close();
		
		
		

	}

}
