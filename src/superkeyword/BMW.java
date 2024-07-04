package superkeyword;

public class BMW extends Car {
	int speed = 200;
	int price = 500;
	
	public BMW() {
		super(20,30);
		System.out.println("BMW default constructor");
		//this.drive();//can call methods from constructor
	}
	
	public BMW(int a) {
		System.out.println("BMW 1 param constructor " + a);
		
	}
	@Override
	public void loading() {
		System.out.println("BMW laoding");
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println(speed);
		int carSpeed = super.speed;
		System.out.println(carSpeed);
		System.out.println("BMW Display");
		System.out.println(price);
		System.out.println(super.price);
		
		loading();
		super.loading();
	}
	
	public void drive() {
		System.out.println(this.speed);//200
		System.out.println(speed);//200
		display();//from current class
		super.display();//calling from parent
		System.out.println(super.speed);//100
	}

//super
//1. to call the parent class constuctor, but should be the first statement
//2. to call parent class properties(methods/vars)

}
