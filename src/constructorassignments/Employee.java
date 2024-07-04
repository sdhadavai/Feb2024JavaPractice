package constructorassignments;

public class Employee {

	private int id;
	private String name;
	private double salary;

	private Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(501, "Srinvas", 50000.00);
		
		System.out.println("---Printing direct by accessing instance variable------");
		System.out.println("Id:" + e1.id + "; Name:" + e1.name + "; Salary:" + e1.salary);
		
		System.out.println("--By using getter metthods--");
		System.out.println("Emp Id:" + e1.getId());
		System.out.println("Emp Name:" + e1.name);
		System.out.println("Emp Salary:" + e1.salary);
		
		double updatedSalary = e1.getSalary() + (e1.getSalary()*10)/100;
		e1.setSalary(updatedSalary);
		System.out.println("Emp Salary after raise of 10%:" + e1.salary);
		
//What is the purpose of a getter method in Java?

//Can a getter method return void?

//What is the access level of a getter method in Java?

//What is the purpose of a setter method in Java?

//Can a setter method return a value other than void?
		

	}

}
