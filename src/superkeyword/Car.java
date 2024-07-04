package superkeyword;

public class Car extends Vehicle{
	
	int speed = 100;
	int price = 300;
	
	public Car() {
		super("MG");
		System.out.println("Car default constructor");
	}
	
	public Car(int a) {
		System.out.println("Car 1 param constructor " + a);
		
	}
	
	public Car(int a, int b) {
		System.out.println("Car 2 param constructor " + a + b);
		
	}
	
	public void display(){
		System.out.println("Car Display");
	}
	
	@Override
	public void loading() {
		System.out.println("Car laoding");
		super.loading();
	}

}
