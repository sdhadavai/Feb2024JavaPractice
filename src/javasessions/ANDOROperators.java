package javasessions;

public class ANDOROperators {

	public static void main(String[] args) {
		
		//AND --> &, &&
		
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = true;
		boolean c4 = true;
		
		if(c1 & c2 & c3 & c4) {// true & false & true & true ==> false
			System.out.println("hi");
			
		}
		else {
			System.out.println("bye");
		}
		
		
		// && -- short circuit operator
		if(c1 && c2 && c3 && c4) {// true && false ==> false
			System.out.println("hi");
			
		}
		else {
			System.out.println("bye");
		}
		
		
		//OR --> |, ||
		
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = true;
		boolean b4 = false;
		
		if(b1 | b2 & b3 | b4) {// true | false | true | true ==> true
			System.out.println("hello");
			
		}
		else {
			System.out.println("bye");
		}
		
		
		// || -- short circuit operator
		if(b1 || b2 || b3 || b4) {// true || true ==> true
			System.out.println("hello");
			
		}
		else {
			System.out.println("bye");
		}
		
		//WAP --> Three different numbers are there 
		//find out the max no.
		int x = 100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z) {//false
			System.out.println("X is greatest");
		}
		else if(y>z) {//false
			System.out.println("y is gretest");
		}
		else {
			System.out.println("z is greatest");
		}
		
		//WAP --> 4 different numbers are there 
		//find out the max no.

	}

}
