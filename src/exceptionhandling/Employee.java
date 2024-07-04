package exceptionhandling;

public class Employee {

	public static void main(String[] args) {
		System.out.println("A");
		
		try {
		int i = 9/10;
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Bye");

	}

}
