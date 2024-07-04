package javasessions;

public class UserTest {
	String name;

	public static void main(String[] args) {

		
		UserTest u1 = new UserTest();
		u1.name = "Mohan";
		
		UserTest u2 = new UserTest();
		u2.name = "Nitesh";
		
		UserTest u3 = new UserTest();
		u3.name = "Pooja";
		
		System.out.println(u1.name); //Mohan
		System.out.println(u2.name); //Nitesh
		System.out.println(u3.name); //Pooja
		
		u1 = u2;
		System.out.println(u1.name); //Nitesh
		System.out.println(u2.name); //Nitesh
		System.out.println(u3.name); //Pooja
		
		u2 = u3;
		System.out.println(u1.name); //Nitesh
		System.out.println(u2.name); //Pooja
		System.out.println(u3.name); //Pooja
		
		u3 = u1;
		System.out.println(u1.name); //Nitesh
		System.out.println(u2.name); //Pooja
		System.out.println(u3.name); //Nitesh
		
		
		
		

	}

}
