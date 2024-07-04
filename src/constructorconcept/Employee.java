package constructorconcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	//Constructor:
	//name will be same as the class name
	//it look like a function but it is not a function
	//Constructor cannot return anything, no void, no return
	//Can be overloaded
	//const... will be called when you create the object
	//const... will help to initialize the instance variables 
	//const... will help to restrict the object creation
	
	//Constructor Vs method
	//Const name should be same as class name but method can be have any name
	//Const cannot return anything even void but method may or many not return
	//const and method can be overloaded
	//const will be called when you create the object of the class but method has to be called using obj ref name.
	//const should be created for restricting the object creation
	//method should be created for the functionality, business logic
	//const.. is used to initialize the instance vars using this keyword: this.G = L
	//static variables should not be created inside the cnst.. but in function it can be done
	//const will not be created in heap, stack. It will be in Class loader
	
	
	/*
	 * public Employee() {//0 parameter constructor / default constructor
	 * System.out.println("Default Const.....");
	 * 
	 * }
	 * 
	 * public Employee(int a) {//1 parameter constructor
	 * System.out.println("1 param:" + a);
	 * 
	 * }
	 * 
	 * public Employee(int a, int b) {//2 parameter constructor
	 * System.out.println("1 param:" + a + b);
	 * 
	 * }
	 */
	
	 public Employee() {//0 parameter constructor / default constructor
		 System.out.println("Default Const.....");
	 }

	public Employee(String name) {
		//name=name; // L = L variable
		this.name = name; // G = L variable
		
	}
	
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Tom");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		e1.age=30;
		System.out.println(e1.age);
		
		e1.name = "Sri";
		System.out.println(e1.name);
		
		Employee e2 = new Employee("Peter", 20);
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		
		
		Employee e3 = new Employee("Lisa", 35, 34.55);
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.salary);
		

		

	}

}
