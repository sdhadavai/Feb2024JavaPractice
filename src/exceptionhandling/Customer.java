package exceptionhandling;

import java.io.FileInputStream;

public class Customer {
	
	String name;
	

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		Customer obj = new Customer();
		obj = null;
		
		
		try {
		//int i = 9/0;//AE
		obj.name="TOM";//NPE
		System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		
		catch(Exception e) {
			System.out.println("E is coming");
			e.printStackTrace();
		}
		
		System.out.println("Bye");
		
		//Checked/Compile time exception
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FileInputStream ip = new FileInputStream("c\\test.pdf");

	}

}
