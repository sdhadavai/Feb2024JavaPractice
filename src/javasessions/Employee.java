package javasessions;

public class Employee {
	
	//data members:
	//class vars:
	String name;
	int age;
	double salary;
	boolean isPerm;
	

	public static void main(String[] args) {
		
		//create the object of Employee class using new keyword
		
		Employee obj = new Employee();
		obj.name="Tom";
		obj.age=20;
		obj.salary=12.33;
		obj.isPerm=true;
		System.out.println(obj.name + " " + obj.age + " " + obj.salary + " " + obj.isPerm);
		
		Employee e1 = new Employee();
		
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPerm);
		
		//no reference objects / anonymous objects: not recommended
		new Employee().name="Ekta";
		new Employee().age = 30;
		
		//null reference objects
		Employee e2 = new Employee();
		e2.name = "Kavi";
		System.out.println(e2.name);
		e2 = null;
		//e2.age=30;//null.age = 30: NPE
		//System.out.println(e2.name);
		
		Employee e3 = new Employee();
		e3.name = "Naveen";
		System.out.println(e3.name);
		e3 = null;
		e3 = new Employee();
		System.out.println(e3.name);//null
		e3.name="Testing";
		e3.age=30;
		System.out.println(e3.name);
		System.out.println(e3.age);
		
		//another way of declaring object
		Employee e4;
		e4 = new Employee();
		
		

	}

}
