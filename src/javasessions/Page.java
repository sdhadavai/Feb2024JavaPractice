package javasessions;

public class Page {
	public int age;
	public static String name="Sri";

	//psvm[String[]] - JVM --> internally calls with class -->Page.mian()
	//caller method -- user method
	//not write any business logic. only for calling other methods
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		Page.main(10);
		Page.main(20, 30);
	}
	
	public static void main(int a) {
		
		System.out.println("hi " + a);
	}
	
	public static void main(int a, int b) {
		
		System.out.println("bye " + (a + b));
	}
	

}
