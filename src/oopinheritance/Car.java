package oopinheritance;


//final calls cannot be a parent, inheritance is not possible
public class Car extends Vehicle {
	
	int minSpeed = 100;
	
	//final and static methods cannot be overridden 
	public final void testDrive() {
		System.out.println("Car --- test driver");
	}
	
	//Use cases final method
	//Logo, company name, 

	public void start() {
		System.out.println("Car --- Start");
	}

	public void stop() {
		System.out.println("Car --- stop");
	}

	public void refuel() {
		System.out.println("Car --- refuel");
	}

	@Override
	public void engnine() {
		System.out.println("Car --- Engine");
	}
	
	public static void billing() {
		System.out.println("Car -- Billing");
	}
	
	//private method cannot be overridden
	private void service() {
		System.out.println("Car --- Service");
	}
	

	
	

}
