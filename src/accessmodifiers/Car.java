package accessmodifiers;

public class Car {
	
	public String name;
	private int price;
	protected double milage;
	String color;
	
	public void test() {
		System.out.println("Car test");
	}
	
	//We cannot reduce the visibility: private < default < protected < public
	//Parent method: default: default, protected, public
	//Parent method: protected: protected, public
	//Parent method: public: public

	public static void main(String[] args) {

		Car c = new Car();
		
		

	}

}
