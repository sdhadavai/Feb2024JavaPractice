package superkeyword;

public class Vehicle {
	int price = 900;
	
	public Vehicle() {
		System.out.println("Vehicle -- default cosnt... ");
	}
	
	public Vehicle(String name) {
		System.out.println("Vehicle -- 1 param cosnt... " + name);
	}
	
	public void loading() {
		System.out.println("Vehicle laoding");
	}

}
