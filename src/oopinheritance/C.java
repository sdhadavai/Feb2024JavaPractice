package oopinheritance;

public class C extends B{
	
	@Override
	public void a1() {
		System.out.println("a1 overridden in C");
	}
	
	@Override
	public void b1() {
		System.out.println("b1 overridden in C");
	}
	
	
	public void a2() {
		System.out.println("a2 overridden in C but not in B");
	}
	
	public void c1() {
		System.out.println("c1 from C");
	}
	
	public void c2() {
		System.out.println("c2 from C");
	}


}
