package oopinterface;

public interface USMedical extends WHO, UN{
	
	//Interface variables are static and final by default in nature;
	int MIN_FEE = 10;
	
	//interface methods cannot have method body
	//abstract method: no method body
	//Cannot create a object of interface
	//abstract methods cannot be static, final, private
	//interface cannot have parent class
	//const... is not allowd
	public void physioServices();
	public void physioServices(int a);
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergenyServices();
	
	public void ENTServcies();
	
	//after JDK 1.8
	//1. Can have a static method with method body
	
	public static void billing() {
		System.out.println("US -- Billing");
	}
	
	//2. can have default method with method body: non static
	//It can be overridden
	default void helpDesk() {
		System.out.println("US -- helpDesk");
	}

}
