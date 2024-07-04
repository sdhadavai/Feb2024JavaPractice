package javasessions;

public class Car {
	
	String name;
	String licenseNumber;
	static final int wheels = 4;//Stored in Common Memory Allocation (CMA) After JDK1.8 / Permanent Generation (Metaspace) before JDK1.8 / Static memory
	int price;
	
	//upto jdk 1.7 fixed size for memory for Static memory(CMA). From JDK 1.8 memory is dynamic (Metaspace)
	
	//Instance variable: n copies
	//Static variable: 1 common copy will be created in CMA

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "Honda";
		c1.licenseNumber = "12323";
		c1.price = 20;
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.licenseNumber = "5343";
		c2.price = 50;
		
		Car c3 = new Car();
		c3.name = "Audi";
		c3.licenseNumber = "8665";
		c3.price = 60;
		
		System.out.println(c1.name);//Honda
		
		//how to access the static variable
		//1. by using class name --> Recommended
		System.out.println(Car.wheels);//4
		
		//2. direct calling(with in the class)
		System.out.println(wheels);//4
		
		//3. using object reference name --> not recommended
		System.out.println(c1.wheels);//4 
		
		//final local variable
		int days = 10;
		int sal = days*10;
		
		//static int s = 300;// We cannot apply static for local variable
		
		//No reference object
		new Car();
		
		//null reference object
		Car c4 = new Car();
		c4 = null;//
		
		//GC method
		
		System.gc();//it does not give any gaurantee that GC will be called as GC is totally dependent on JVM
		

	}

}
