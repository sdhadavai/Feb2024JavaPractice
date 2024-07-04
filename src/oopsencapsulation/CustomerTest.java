package oopsencapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		
		//CRUD --> Create Retrieve Update Delete
			
		//POST --> Create
		Customer obj = new Customer("Ayesha", 25, 23.44, true);
		
		//GET --> Retrieve
		System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSalary() + " " +  obj.isActive());
		
		//PUT/PATCH --> Update
		obj.setSalary(35.55);
		obj.setAge(30);
		
		//GET
		System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSalary() + " " +  obj.isActive());
		
		
		//We can use setters to initialize the values but not helping while creating object. So we use constructor to initialize the values for the first time and setters used to update the value after
		
		//2nd use case
		
		Customer c = new Customer();//NOT POST call
		//GET
		System.out.println(c.getName() + " " + c.getAge() + " " + c.getSalary() + " " +  c.isActive());
		
		//PUT
		c.setName("Ravi");
		c.setAge(40);
		c.setSalary(34.55);
		c.setActive(true);
		//GET
		System.out.println(c.getName() + " " + c.getAge() + " " + c.getSalary() + " " +  c.isActive());
		
		//PUT/PATCH
		c.setActive(false);
		//GET
		System.out.println(c.getName() + " " + c.getAge() + " " + c.getSalary() + " " +  c.isActive());
		
		

	}

}
