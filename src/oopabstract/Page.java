package oopabstract;

public abstract class Page {
	
	//cannot create the object of abstract class
	//can have abstract + non abstract methods
	//can we have the const.. of abstract class?? YES
	//this will be called when we create the object of child class
	
	//only abstract methods: 100% abstraction
	//only non abstract methods: 0% abstraction
	//abs + non abstract methods: Partial abstraction [0 - 100 %]
	
	
	final static int TIME_OUT = 10;
	
	
	public Page(){
		System.out.println("Page Default Constructor");
	}
	
	public Page(int a){
		System.out.println("Page one Param... Constructor " + a);
	}
	
	public Page(int a ,int b){
		System.out.println("Page two Param... Constructor " + a + b);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public static final void displayLogo() {
		System.out.println("Page -- display logo");
	}
	
	public void getPageInfo() {
		System.out.println("Page -- getPageInfo");
	}
	
	private void billing() {
		System.out.println("Page --- Billing");
	}
	
	public void getBillingInfo() {
		billing();
	}
	

}
