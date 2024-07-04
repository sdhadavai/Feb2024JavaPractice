package superkeyword;

public class Page {
	String name;
	String title;
	
	public Page() {
		this("loginpage");//this should be the first statement
		//this("loginpage", "amazon");
		System.out.println("Page default const");
		
	}
	
	public Page(String name) {
		this("loginpage", "amazon");
		System.out.println("Page 1 param const");
		
	}
	
	public Page(String name, String title) {
		//this();
		System.out.println("Page 2 param const");
		System.out.println(name);
		System.out.println(title);
		//this.name=name;
		//this.title= title;
		
	}
	
//this keyword use cases:
//1. to initialize the instance variables with local variables in constructor
//2. used with getter/setter
//3. Builder pattern: method returns this
//4. Constructor calling within the same class

}
