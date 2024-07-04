package constructorassignments;

public class Car {
	
	String make;
	String model;
	int year;
	
	public Car(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	
	public Car() {
		this.make="Unknown";
		this.model="Unknown";
		this.year=0;
		
	}
	
	

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.make + " " + c1.model + " " + c1.year);
		Car c2 = new Car("Honda", "City", 2010);
		System.out.println(c2.make + " " + c2.model + " " + c2.year);
		
		Car c3 = new Car();
		System.out.println(c3.make + " " + c3.model + " " + c3.year);
		Car c4 = new Car("Maruthi", "Swift", 2019);
		System.out.println(c4.make + " " + c4.model + " " + c4.year);
		
		Car c5 = new Car();
		System.out.println(c5.make + " " + c5.model + " " + c5.year);
		Car c6 = new Car("Benz", "C Class", 2024);
		System.out.println(c6.make + " " + c6.model + " " + c6.year);
		

	}

}
