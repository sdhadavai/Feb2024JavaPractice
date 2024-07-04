package javasessions;

import java.util.Arrays;

public class MethodsAssignments2 {

//1. Methods without Return Value (void) and without Parameters:
//Write a method to print "Hello, World!" to the console without taking any input.

	public void printHello() {
		System.out.println("Hello World!");
	}

//2. Method with Return Value (int) and with Parameters (int, int): 
//Write a method to add two integers and return the result.

	public int addition(int a, int b) {
		return a + b;
	}
//3. Method with Return Value (boolean) and with Parameters (String, String):
//Write a method to compare two strings and return true if they are equal, false otherwise.

	public boolean compareTwoStrings(String firstString, String secondString) {

		if (firstString.equalsIgnoreCase(secondString)) {
			return true;
		} else {
			return false;
		}
	}
//4. Method with Return Value (double) and with Parameters (double[]):
// Write a method to calculate the average of elements in a double array and return the result.

	public double findAvg(double[] numbers) {
		double avg = 0;
		double total = 0;
		int noOfElement = numbers.length;
		for (double e : numbers) {
			total = total + e;
		}
		avg = total / noOfElement;

		return avg;
	}

//5. Method with Return Value (String) and with Parameters (String[]):
//Write a method to concatenate all strings in a string array and return the concatenated string.	

	public static String concatenateStrings(String[] strings) {
		String finalString = "";
		for (String e : strings) {
			finalString = finalString + e;
		}

		return finalString;
	}
//6. Method with Return Value (Object[]) and with Parameters (Object[]):
//Write a method to reverse the order of elements in an Object array and return the reversed array. 
	
	public Object[] reverseArray(Object[] elements) {
		Object[] reverseArray = new Object[elements.length];
		int j =0;
		for(int i = elements.length-1; i>=0; i--) {
			reverseArray[j] = elements[i];
			j++;
		}
		
		
		return reverseArray;
	}
	
// 7.Method without Return Value (void) and with Parameters (int, int[]):
//Write a method to print each element of an int array multiplied by a given factor. 
	
	public void printArrayWithFactor(int factor, int[] array) {
		
		for(int e : array) {
			System.out.print((e*factor) + " ");
		}
		System.out.println();
		
	}
	
//8 Method without Return Value (void) and with Parameters (String, boolean):
//Write a method to print a message based on a boolean value (true for success, false for failure). 

 public void printStatusMessage(String message, boolean isSuccess) {
	 
	if(isSuccess) {
		System.out.println("Sucsess " + message);
	}else {
		System.out.println("Failure " + message);
	}
 }
 
//9. Method without Return Value (void) and with Parameters (String[]): Will cover this with String Manipulation Concept.
//Write a method to print each element of a string array in reverse order.
 
 public void stringReverse(String[] elements) {
	 String[] sra = new String[elements.length];
	 int j=0;
	 for(String e:elements) {
		 String r = "";
		 for(int i = e.length()-1; i>=0; i--) {
			 r = r+e.charAt(i);
		 }
		 sra[j] = r;
		 j++;
	 }
	 System.out.println("Original Array: " + Arrays.toString(elements));
	 System.out.println("Elements Reverse Array: " + Arrays.toString(sra));
	 
 }

 public void printReverseStringArray(String[] strings) {
	 
 }
 
 
 
 
 
 

	public static void main(String[] args) {

		MethodsAssignments2 ma = new MethodsAssignments2();
		// 1.
		ma.printHello();
		// 2.
		System.out.println("Addition of two numbers: " + ma.addition(2, 5));
		// 3.
		String str1 = "Srinvas";
		String str2 = "SRINVS";
		boolean result = ma.compareTwoStrings(str1, str2);
		System.out.println(str1 + " and " + str2 + " are equal or not? " + result);
		// 4
		double[] nos = { 10.5, 21.5 };
		System.out.println("Average of nos: " + ma.findAvg(nos));
		// 5.
		String[] strings = { "Srinvas", "Jyothi", "Anu", "Soham" };
		String conString = MethodsAssignments2.concatenateStrings(strings);
		System.out.println("Concatinated String is: " + conString);
		//6.
		Object[] elements = {"Srinvas", 44, 'M', 50000.00, "Hyd"};
		Object[] reverseArrayElements = ma.reverseArray(elements);
		System.out.println("Original Array Elements: " + Arrays.toString(elements));
		System.out.println("Reverse Array Elements: " + Arrays.toString(reverseArrayElements));
		
		//7.
		int[] array = {1,2,3,4,5};
		ma.printArrayWithFactor(6, array);
		
		//8. 
		ma.printStatusMessage("Operation Completed", true);
		ma.printStatusMessage("Operation Failed", false);
		//9.
		String[] stringElements = {"Srinvas", "Jyothi","Anu","Soham"};
		ma.stringReverse(stringElements);
		

	}

}
