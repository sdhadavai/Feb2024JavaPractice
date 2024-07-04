package oopinheritance;

public class CarTest {

	public static void main(String[] args) {
		
		
		BMW obj = new BMW();
		obj.start();//overridden
		obj.stop();//inherited
		obj.refuel();//inherited
		obj.autoParking();//individual
		obj.engnine();//overridden
		obj.drive();
		BMW.billing();//child class name can access parent class static method if it is not present in child class
		Car.billing();
		System.out.println(obj.minSpeed);//100
		obj.BMWServcie();
		//obj.minSpeed;
		
		
		System.out.println("---------");
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.engnine();
		au.theftSafty();
		//au.autoParking;//Not posssible as it is sibling class
		
		System.out.println("---------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.autoParking();//Not possible it is from child class
		c.engnine();//inherited
		System.out.println(c.minSpeed);//200
		
		
		System.out.println("---------");
		//Child class object can be referred by parent class ref variable
		//Top/Up Casting: Java will always check Reference Type check 
		Car c1 = new BMW(); //Every BWM is acar
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engnine();
		//c1.autoParking// Not allowed as type check is failing
		c1.drive();
		System.out.println(c.minSpeed);//100
		
		
		// Top casting with Grand parent
		System.out.println("---------");
		Vehicle v1= new BMW();
		//v1.start();//not possible as start() is from Car class Vehicle check
		v1.engnine();
		v1.drive();
		
		
		
		
		//Down Casting
		System.out.println("---------");
		//BMW b1 = new Car();//Every car is a BMW. not possible by Java it gives error
		
		//BMW b1 = (BMW) new Car();//We'll get ClassCastException at run time
		//BMW b1 = (BMW) new Vehicle();//ClassCastException
		//Car c2 = (Car) new Vehicle();//ClassCastException
		

		
		Truck tr = new Truck();
		tr.engnine();
		tr.drive();
		tr.heavyLoading();
		
		//final can apply on
		//1. Constraint
		//2. class
		//method
		
		

	}

}
