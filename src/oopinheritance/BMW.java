package oopinheritance;

public class BMW extends Car //, Truck not possible to extend multiple classes
{
	int minSpeed = 200;
	//Method Overriding: Polymorphism: Run Time (Dynamic)
	//when we have a method in parent class and the same method in child class with
	//1. with same name
	//2. with same no of parameters with the same sequence
	//3. with same return type
	//4. 
	

	//Overridden method
	@Override
	public void start() {
		System.out.println("BMW -- Start");
	}
	
	@Override
	public void engnine() {
		System.out.println("BMW --- Engine");
	}

	public void autoParking() {
		System.out.println("BMW --- Auto Parking");
	}
	
	//Method Hiding --> where we have same static method in Parent and child class
	//static methods can be overloaded but not overriding
	public static void billing() {
		System.out.println("BMW -- Billing");
	}
	
	
	//not overridden 
	private void service() {
		System.out.println("BMW --- Service");
	}
	
	public void BMWServcie() {
		service();
	}
	
	

}
