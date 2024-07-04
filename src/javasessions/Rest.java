package javasessions;

public class Rest {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1();//SOFError
		
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		//t1();//SOFError
		Rest obj = new Rest();
		obj.m1();
	}

	public static void main(String[] args) {

		Rest obj = new Rest();
		//obj.m1();
		t1();


	}

}
