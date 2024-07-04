package constructorassignments;

public class Rectangle {

	double lenght;
	double width;
	
	public Rectangle() {
		this.lenght=0.0;
		this.width=0.0;
	}
	
	public Rectangle(double length, double width) {
		this.lenght=length;
		this.width=width;
	}
	
	public double calculateArea() {
		return lenght*width;
	}
	
	
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		System.out.println("Area of rectangle with zero params is:" + r.calculateArea());
		Rectangle r1 = new Rectangle(12.0, 23.5);
		System.out.println("Area of rectangle with params is:" + r1.calculateArea());

	}
//What is the purpose of a default constructor in Java?

//How can you differentiate between a default constructor and a constructor that takes in parameters?

//What is the access level of a constructor in Java?

//Can a constructor be private? If so, why would you want to make a constructor private?

//Can a constructor call a method from another class? 


}
