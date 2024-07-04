package inheritanceassignments;

public class TestVehicle {

	public static void main(String[] args) {
		
		//Using child class objects
		System.out.println("-----------------Using Car child class refrence-------------------------");
		Car c = new Car();
		System.out.println("Accessing Car Child class members by using child class Car reference");
		//Accessing child class members
		System.out.println("Car no of doors:" + c.numDoors);
		c.playMusic();
		//Accessing Parent class members
		System.out.println("Accessing Vehicle Parent class members by using child class Car reference");
		System.out.println("Vehicle Brand:" + c.brand);
		System.out.println("Vehicle Model:" + c.model);
		System.out.println("Vehicle year:" + c.year);
		c.start();
		c.accelerate();
		System.out.println("***************************************************************************************");
		Motorcycle m = new Motorcycle();
		System.out.println("----------------Using Motorcyle child class refrence------------------");
		System.out.println("Accessing Motorcyle Child class members  by using child class Motorcycle reference");
		System.out.println("Motorcycle Engine:" + m.engineType);
		m.wheelie();
		System.out.println("Accessing Vehicle Parent class members by using child class Motorcycle reference");
		System.out.println("Vehicle Brand:" + c.brand);
		System.out.println("Vehicle Model:" + c.model);
		System.out.println("Vehicle year:" + c.year);
		m.start();
		m.accelerate();
		System.out.println("***************************************************************************************");
		
		Truck t = new Truck();
		System.out.println("----------------Using Truck child class refrence------------------");
		System.out.println("Accessing Truck Child class members  by using child class Truck reference");
		System.out.println("Truck Cargo Capacity:" + t.cargoCapacity);
		t.laodCargo();
		System.out.println("Accessing Vehicle Parent class members by using child class Truck reference");
		System.out.println("Vehicle Brand:" + c.brand);
		System.out.println("Vehicle Model:" + c.model);
		System.out.println("Vehicle year:" + c.year);
		t.start();
		t.accelerate();
		
		System.out.println("***************************************************************************************");
		//Using Parent class reference pointing to Parent class object. We can access only Parent class members
		Vehicle v = new Vehicle();
		System.out.println("----------------Using Parent class reference pointing to Parent class object. We can access only Parent class members------------------");
		System.out.println(v.brand);
		System.out.println("Vehicle Brand:" + c.brand);
		System.out.println("Vehicle Model:" + c.model);
		System.out.println("Vehicle year:" + c.year);
		v.start();
		v.accelerate();
		
		System.out.println("***************************************************************************************");
		//Using Parent class reference pointing to child class object. We can access only Parent class members
		System.out.println("-------Vehicle class reference poiting to Car class object-------");
		//We can access overridden methods from parent class and inherited methods. As we do not have Overridden methods we can access only inherited methods
		Vehicle vc = new Car();
		System.out.println(vc.brand);
		System.out.println(vc.model);
		System.out.println(vc.year);
		vc.start();
		vc.accelerate();
		//System.out.println(vc.numDoors);/numDoors cannot be resolved or is not a field compile time error
		//vc.playMusic();//The method playMusic() is undefined for the type Vehicle  compile time error
		
		System.out.println("-------Vehicle class reference poiting to Motorcycle class object-------");
		//We can access overridden methods from parent class and inherited methods. As we do not have Overridden methods we can access only inherited methods
		Vehicle vm = new Motorcycle();
		System.out.println(vm.brand);
		System.out.println(vm.model);
		System.out.println(vm.year);
		vm.start();
		vm.accelerate();
		//engineType, wheelie() --> Cannot access
		System.out.println("-------Vehicle class reference poiting to Truck class object-------");
		//We can access overridden methods from parent class and inherited methods. As we do not have Overridden methods we can access only inherited methods
		Vehicle vt = new Truck();
		System.out.println(vt.brand);
		System.out.println(vt.model);
		System.out.println(vt.year);
		vt.start();
		vt.accelerate();
		//cargoCapacity, loadCargo()  --> Cannot access
		

	}

}
