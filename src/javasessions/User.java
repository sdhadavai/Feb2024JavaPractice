package javasessions;

public class User {
	
	//Class/Global variables
	String name;
	int age;
	String city;
	
	

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Arti";
		u1.age = 25;
		u1.city = "Pune";
		
		User u2 = new User();
		u2.name = "Kavita";
		u2.age = 35;
		u2.city = "Bangalore";
		
		User u3 = new User();
		u3.name = "Ravi";
		u3.age = 30;
		u3.city = "LA";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Arti 25 Pune
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Kavita 35 Bangalore
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Ravi 30 LA
		
		System.out.println("----------------");
		
		u1 =u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Kavita 35 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Kavita 35 Bangalore
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Ravi 30 LA
		
		System.out.println("----------------");
		
		u2 = u3;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Kavita 35 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Ravi 30 LA
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Ravi 30 LA
		
		System.out.println("----------------");
		
		u3 = u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Kavita 35 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Ravi 30 LA
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Kavita 35 Bangalore

		System.out.println("----------------");
		
		u1 = u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Ravi 30 LA
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Ravi 30 LA
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Kavita 35 Bangalore
	}

}
