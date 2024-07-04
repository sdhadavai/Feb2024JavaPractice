package javasessions;

public class FunctionsInJava {
	
	
	//function: data member of the class
	//cannot create a function inside a function, but call a function from another function
	//function is a block of code which can be called multiple times
	
	
	//Types:
	//1. with no input and no return:
	//void -> cannot return anything
	
	public void test() {//0 input parameter
		System.out.println("test method");
	}
	
	public void getInfo() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	//2. with no input and with return
	//purpose of return is to manupulat the value on returned value.
	
	public int getBillAmount() {
		System.out.println("getBillAmount");
		int foodBill =100;
		int tax=20;
		int finalAmount = foodBill + tax;
		return finalAmount;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	//3. with input and with return
	public int add(int a, int b) {
		System.out.println("adding two numbers");
		int sum = a+b;
		return sum;
	}
	
	//it's a bad practice that if we are using more parameters but using less in the method
	/*
	 * public int getTotalMarks(int firstSubject, int secondSubject, int
	 * negativeMarking) { System.out.println("getting total marks"); int finalMarks
	 * = firstSubject + secondSubject; return finalMarks;
	 * 
	 * }
	 */
	
	public double getTotalMarks(int firstSubject, int secondSubject, double negativeMarking) {
		System.out.println("getting total marks");
		double finalMarks = firstSubject + secondSubject - negativeMarking;
		return finalMarks;
		
	}
	
	

	public static void main(String[] args) {
		
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();//test method
		obj.getInfo();//30
		int billAmount=obj.getBillAmount();//getBillAmount
		System.out.println(billAmount);//120
		System.out.println(billAmount-1);//110
		System.out.println(obj.getBillAmount());//120// bad practice, store it in variable and use it.
		String trainer = obj.getTrainerName();
		System.out.println(trainer);//Naveen
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);//30
		int s2 = obj.add(20, 5);
		System.out.println(s2);//25
		
		double  d = obj.getTotalMarks(100, 200, 10.33);
		System.out.println(d);//289.67
		
		
		
		
		
		

	}

}
