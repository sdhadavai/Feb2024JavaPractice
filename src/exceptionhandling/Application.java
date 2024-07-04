package exceptionhandling;

public class Application {
	
	public void m1() throws ArithmeticException {
		System.out.println("m1 method");
		m2();
		
	}
	
	public void m2() throws ArithmeticException {
		System.out.println("m2 method");
		try {
		m3();
		}
		catch (ArithmeticException e) {
			System.out.println("AE is coming");
			//reports --> PASS/FAIL
			//screenshots
			//logs
		}
	}
	
	//Assume m3() is coming from other app
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		
		int i = 9/0;
	}

	public static void main(String[] args) {
		
		Application obj = new Application();
		
		obj.m1();
		
		System.out.println("Bye");
		

	}

}
