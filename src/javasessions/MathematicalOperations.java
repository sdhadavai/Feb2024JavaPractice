package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {

		System.out.println(10/2);
		System.out.println(9/2);//4
		
		//If both nos are integer then o/p is integer
		//If any one of the no is double then o/p is double
		
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		//System.out.println(9/0);// ArithmaticException: / by zero
		System.out.println(9.0/0);//Infinity
		System.out.println(0/9);//0
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		//System.out.println(0/0);// ArithmaticException: / by zero
		
		System.out.println(0.0/0.0);//NaN (Not a Number)
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		System.out.println(1.22/0);//Infinity
		System.out.println(0.1+0.4);//0.5
		System.out.println(0.1+0.2);//0.30000000000000004
		System.out.println(0.1+0.7);//0.7999999999999999
	}

}
