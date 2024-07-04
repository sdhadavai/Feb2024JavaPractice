package constructorassignments;

public class Person {
	
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender, double height) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		main();
		
	}
	public void main() {
		System.out.println("test methos in constructor");
		
		
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Srinvas", 44, 'm', 5.9);
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " + p1.height);
		Person p2 = new Person("Jyothis", 33, 'f', 5.5);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender + " " + p2.height);
		
	}
	
//1.What is the purpose of a constructor in Java?
//Constructor is used to initialize instance variables in java

//2. How does a constructor differ from a regular method in Java?
	// Constructor is must be same as Class name whereas method name can be any
	// Constructor dosn't return anything even void whereas method may or may not return value
	// Constructor is called whenever we create object but for method we need to call explicitly
	

//3. Can a Java class have multiple constructors? If so, how are they differentiated?
	//Java can have multiple constructors, they can be overloaded constructors

//4. What happens if a constructor is not defined in a Java class?
	//If you don’t implement any constructor in your class, the Java compiler inserts default constructor into your code on your behalf. 
	//You will not see the default constructor in your source code (the .java file) as it is inserted during compilation and present 
	//in the bytecode (.class file).

//Can a constructor call other methods or constructors within the same class?
	//yes we can call other methods and construction with the same class

}
