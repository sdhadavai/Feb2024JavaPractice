package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		//1. using new
		int i[] = new int[4];
		
		//2. array literals: when we have data with us
		int p[] = {1,2,4,6,334,64,657,94};
		System.out.println(p.length);
		System.out.println("li = "+ 0);
		System.out.println("hi = " + (p.length-1));
		
		System.out.println(p[0]);
		
		String students[] = {"jay", "Akash", "Ravi","Puja"};
		System.out.println(Arrays.toString(students));
		
		Object empData[] = {"Ekta", 25, 43.33, 'f', true};
		System.out.println(Arrays.toString(empData));

	}

}
