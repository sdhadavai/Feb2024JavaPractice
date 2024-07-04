package constructorconcept;

public class Registration {

	String name;
	String emailId;
	String phone;
	int age;
	String city;
	String dob;
	static final String compName = "IBM";

//Hidden - default const... will be added by Java

	public Registration(String name, String emailId) {
		
		this.name = name;
		this.emailId = emailId;
	}

	public Registration(String name, String emailId, String phone) {
		;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}

	public Registration(String name, String emailId, String phone, int age, String city) {
		
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
	}

	public Registration(String name, String emailId, String phone, int age, String city, String dob) {
		
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.dob = dob;
	}

	public static void main(String[] args) {

		Registration r1 = new Registration("naveen", "naveen@gmail.com");
		System.out.println(r1.name + " " +r1.age + " " + r1.emailId + " "+ r1.city + " " + r1.dob + " " + r1.phone);
		
		Registration r2 = new Registration("sd", "sd@gmail.com", "685757785578", 40, "Bengalure", "01-09-2000");
		System.out.println(r2.name + " " +r2.age + " " + r2.emailId + " "+ r2.city + " " + r2.dob + " " + r2.phone);
		
		Registration r3 = new Registration("Akanksha","akanksha@gmail.com", null, 30, "Bengalure", null);
		System.out.println(r3.name + " " +r3.age + " " + r3.emailId + " "+ r3.city + " " + r3.dob + " " + r3.phone);
		r3.phone="943454325435";
		System.out.println(r3.name + " " +r3.age + " " + r3.emailId + " "+ r3.city + " " + r3.dob + " " + r3.phone);
		r3.emailId="ak@yahoo.com";
		System.out.println(r3.name + " " +r3.age + " " + r3.emailId + " "+ r3.city + " " + r3.dob + " " + r3.phone);
		

	}

}
