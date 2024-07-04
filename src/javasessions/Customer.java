package javasessions;

public class Customer {
	
	//method overloading: OOP -> Poly(many) + morphism(forms): compile time(static)
	//when in the same class, we have methods
	//1. with same method name
	//2. with different number of params
	//3. with different sequence param
	//4. return type doesn't matter
	
	
	public void test() {//0 param
		System.out.println("test method");
	}
	

	public int test(String a) {// 1 param
		return 0;
	}
	public String test(double a) {// 1 param
		return "Sri";
	}


	
	
	public void test(int a) {//1 param
		System.out.println("test method " + a);
	}
	public void test(int a, int b) {//2 param
		System.out.println("test method " + a + a);
	}
	public void test(int a, String b) {//2 param
		System.out.println("test method " + a + b);
	}
	public void test(String a, int b) {
		System.out.println("test method " + a + b);
	}
	
	public void test(String a, int b, float c) {//3 param
		System.out.println("test method " + a + b);
	}
	
	public void test(float a, int b, float c) {
		System.out.println("test method " + a + b);
	}
	
	public String getData() {
		return "Sri";
	}
	public String getData(String s) {
		return "Sri";
	}
	
	//Use Cases:
	//amazon search
	
	public void search() {
		System.out.println("Default serach");
	}
	
	public void search(String name) {
		System.out.println("Serach with " + name);
	}
	
	public void search(String name, int price) {
		System.out.println("Serach with " + name + " " + price);
	}
	
	public void search(String name, int price, String color) {
		System.out.println("Serach with " + name + " " + price + " " + color);
	}
	
	//payment
	public void doPayment(String upi) {
		
	}
	public void doPayment(String CC, String cvv) {
		
	}
	public void doPayment(String cc, String cvv, String otp) {
		
	}
	public void doPayment(String paypalId, int otp, String pwd) {
		
	}
	
	//uber 
	public void booking (String st, String end) {
		
	}
	public void booking (String st, String end, String carType) {
		
	}
	public void booking (String st, String end, String carType, int persons) {
		
	}
	
	//login method
	
	public void doLogin() {
		
	}
	
	public void doLogin(String un, String pwd) {
		
	}
	
	public void doLogin(String un, String pwd, String role) {
		
	}
	
	public void doLogin(String socialMediaAccount, String pwd, int otp) {
		
	}
	

	public static void main(String[] args) {
		
		Customer obj = new Customer();
		
		obj.test();
		obj.test(10);//value/argument
		obj.test(10, 20);
		obj.test("Sri", 60);
		
		obj.search();
		obj.search("IPhone");
		
		
		//calling a method by passing a value/argument: call by value/argument

	}

}
