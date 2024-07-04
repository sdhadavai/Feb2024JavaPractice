package javasessions;

public class CallByRef {
	
	String name;
	int age;
	
	public static void test(CallByRef t1) {
		System.out.println("test method");
		System.out.println(t1.name);
		System.out.println(t1.age);
		
	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		obj.name="Rahul";
		obj.age=30;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		CallByRef.test(obj); //call by reference
		
		CallByRef obj1 = new CallByRef();
		obj1.name="Sri";
		obj1.age=44;
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		CallByRef.test(obj1); //call by reference

	}

}
