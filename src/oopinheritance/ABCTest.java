package oopinheritance;

public class ABCTest {

	public static void main(String[] args) {

		//Run time first it looks if method is present in current class then it executes otherwise it goes to parent then next parent and so on
		
		//By using child class object (C --> C)we can access all methods from child class and it's parent, grand parent etc...
		System.out.println("C --> C");
		C c = new C();
		c.a1();//a1 overridden in C
		c.a2();//a2 overridden in C but not in B
		c.a3();//a3 from A
		c.b1();//b1 overridden in C
		c.b2();//b2 from B
		c.c1();//c1 from C
		c.c2();//c2 from C
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		//By using intermediate class object (B --> B): We can access current class methods and parent class methods
		System.out.println("B --> B");
		B b = new B();
		b.a1();//a1 overridden in B
		c.a2();//a2 overridden in C but not in B
		b.a3();//a3 from A
		b.b1();//b1 from B
		b.b2();//b2 from B
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		//By using Parent class object (A --> A) : We can access current class methods and parent class methods if any(Object is the Super class of all classes)
		System.out.println("A --> A");
		A a = new A();
		a.a1();//a1 from A
		a.a2();//a2 from A
		a.a3();//a3 from A
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
		//Intermediate class reference pointing to Child class object ( B --> C)
		//Cannot access child class individual methods
		System.out.println("B --> C");
		B bc = new C();
		bc.a1();//a1 overridden in C
		bc.a2();//a2 overridden in C but not in B
		bc.b1();//b1 overridden in C
		bc.b2();//b2 from B
		bc.a3();//a3 from A
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		//Parent class reference pointing to Grand Child class object ( A --> C)
		//Cannot access child class individual methods and intermediate overridden methods as well
		System.out.println("A --> C");
		A ac = new C();
		ac.a1();//a1 overridden in C
		ac.a2();//a2 overridden in C but not in B
		ac.a3();//a3 from A
		
		//Parent class reference pointing to Child class object ( B --> C)
		//
		System.out.println("A --> B");
		A ab = new B();
		ab.a1();//a1 overridden in B
		ab.a2();//a2 from A
		ab.a3();//a3 from A
		
		//The final conclusion is whenever we create object with different reference in that case we can access only the overridden methods and inherited methods of that reference class 
		//In compilation it shows parent reference but it executes the child class method
		
	}

}
