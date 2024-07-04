package encapasignments;

public class Person {

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printInfo() {
		System.out.println("Name of the Person:" + getName());
		System.out.println("Age of the Person:" + getAge());
		System.out.println("Gender of the Person:" + getGender());
	}

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Srinvas");
		p1.setAge(44);
		p1.setGender("Male");
		p1.printInfo();
		
		Person p2 = new Person();
		p2.setName("Jyothi");
		p2.setAge(33);
		p2.setGender("Female");
		p2.printInfo();
	}
	
//What is encapsulation and how does it relate to object-oriented programming?

//Why is it important to use getter and setter methods instead of accessing attributes directly?

//How can encapsulation improve the security and reliability of a program?

//What is the difference between a private attribute and a public attribute?

//How does encapsulation help with code maintainability and scalability?

}
