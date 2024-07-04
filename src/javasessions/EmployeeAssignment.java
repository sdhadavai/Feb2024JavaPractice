package javasessions;

public class EmployeeAssignment {

	String name;
	int age;
	double salary;
	double totalSalary;

	public static void main(String[] args) {
		double totalSalary = 0;

		EmployeeAssignment e1 = new EmployeeAssignment();
		e1.name = "Srinvas";
		e1.salary = 5;
		totalSalary = totalSalary + e1.salary;

		EmployeeAssignment e2 = new EmployeeAssignment();

		e2.name = "Jyothi";
		e2.salary = 10;
		totalSalary = totalSalary + e2.salary;

		EmployeeAssignment e3 = new EmployeeAssignment();
		e3.name = "Anu";
		e3.salary = 15;
		totalSalary = totalSalary + e3.salary;
		
		System.out.println("Emp Name:" + e1.name + " and salary is: " + e1.salary);
		System.out.println("Emp Name:" + e2.name + " and salary is: " + e2.salary);
		System.out.println("Emp Name:" + e3.name + " and salary is: " + e3.salary);
		System.out.println("Total salary of all emps:" + totalSalary);
		
		e1.salary=15;
		totalSalary = totalSalary + e1.salary;
		System.out.println("Emp Name:" + e1.name + " and salary is: " + e1.salary);
		System.out.println("Total salary of all emps:" + totalSalary);
		
		EmployeeAssignment e4 = new EmployeeAssignment();
		e4.name = "Soaham";
		e4.salary = 5;
		totalSalary = totalSalary + e4.salary;
		System.out.println("Emp Name:" + e4.name + " and salary is: " + e4.salary);
		System.out.println("Total salary of all emps:" + totalSalary);
		

	}

}
