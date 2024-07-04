package javasessions;

public class Student {
	String name;
	int age;

	public static void main(String[] args) {
		
		int totStudnets = 0;

		Student obj1 = new Student();
		obj1.name="Srinvas";
		obj1.age=44;
		totStudnets++;
		
		Student obj2 = new Student();
		obj2.name="Anu";
		obj2.age=13;
		totStudnets++;
		
		System.out.println(obj1.name + " " + obj1.age);
		System.out.println(obj2.name + " " + obj2.age);
		System.out.println("Total No of Students: " + totStudnets);
		obj1.age=33;
		
		System.out.println(obj1.name + " " + obj1.age);
		
		Student obj3 = new Student();
		obj3.name="Soahm";
		obj3.age=5;
		totStudnets++;
		
		System.out.println(obj3.name + " " + obj3.age);
		System.out.println("Total No of Students: " + totStudnets);

	}

}
