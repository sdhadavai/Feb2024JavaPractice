package webdriver_arch_interface;

public class SafariDriver implements WebDriver{
	
	public SafariDriver() {
		System.out.println("Safari is launched");
	}

	@Override
	public void findElement(String name) {
		System.out.println("finding element with name: " + name);
		
	}

	@Override
	public void findElements(String name) {
		System.out.println("finding elements with name: " + name);
		
	}

	@Override
	public void get(String url) {
		System.out.println("launching url: " + url);
		
	}

	@Override
	public String getTitle() {
		
		return "Amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on URL: " + element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("enter the value: " + " in element " + element);
		
	}

	@Override
	public void close() {
		System.out.println("Closing Safari browser");
		
	}

}
