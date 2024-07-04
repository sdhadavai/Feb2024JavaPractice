package javasessions;

public class WideningAndNarrowingAssignment {

	public static void main(String[] args) {

//Q1: Widening Casting Assignment: Write a Java program that demonstrates widening casting. 
//Create variables of different data types such as int, float, double, etc. 
//Assign values to them and then cast them to a higher data type. Finally, print out the original and 
//casted values to observe widening casting in action.

		byte b = 12;
		short s = 23;
		int i = 45;
		float f = 23.54f;
		double d = 54.99;
		char ch = 'S';

		// Byte storing into higher data type.
		short s1 = b;
		int i1 = b;
		float f1 = b;
		double d1 = b;

		// Short storing into higher data type.
		int i2 = s;
		float f2 = s;
		double d2 = s;
		
		//int storing into higher data type.
		float f3 = s;
		double d3 = s;
		
		// float storing into higher data type.
		double d4 = f;
		
		//char storing into higher value
		int i3 = ch;
		float f4 = ch;
		float d5 = ch;
		
		
		System.out.println("Original byte value: " + b);
		System.out.println("Original short value: " + s);
		System.out.println("Original int value: " + i);
		System.out.println("Original float value: " + d);
		System.out.println("Original double value: " + d);
		System.out.println("Original char value: " + ch);
		
		System.out.println("------Widening Implicit Casting-------");
		
		System.out.println("Widened byte to short: " + s1);
		System.out.println("Widened byte to int: " + i1);
		System.out.println("Widened byte to float: " + f1);
		System.out.println("Widened byte to double: " + d1);
		
		System.out.println("Widened short to int: " + i2);
		System.out.println("Widened short to float: " + f2);
		System.out.println("Widened short to double: " + d2);
		
		System.out.println("Widened int to float: " + f3);
		System.out.println("Widened int to double: " + d3);
		
		System.out.println("Widened float to double: " + d4);
		
		System.out.println("Widened char to int: " + i3);
		System.out.println("Widened char to float: " + f4);
		System.out.println("Widened char to double: " + d5);
		
//Q2: Narrowing Casting Assignment: Develop a Java program to illustrate narrowing casting. Declare variables of higher data types like double, float, long, etc., and assign values to them. 
//Then, cast these variables to lower data types like int, short, byte, etc. Print out the original and casted values to observe narrowing casting in action.
		
		System.out.println("------Norrowing Explisit Casting-------");
		double dd = 234.543;
		float ff = 456.345f;
		long l = 343435353535l;
		
		int ii1 = (int)dd;
		int ii2 = (int)ff;
		int ii3 = (int)l;
		
		short s2 = (short)dd;
		short s3 = (short)ff;
		short s4 = (short)l;
		
		byte b2 = (byte)dd;
		byte b3 = (byte)ff;
		byte b4 = (byte)l;
		
		System.out.println("Origianl double value: " + dd);
		System.out.println("Origianl float value: " + ff);
		System.out.println("Origianl long value: " + l);
		
		System.out.println("Narrowed double to int: " + ii1);
		System.out.println("Narrowed float to int: " + ii2);
		System.out.println("Narrowed long to int: " + ii3);
		
		System.out.println("Narrowed double to short: " + s2);
		System.out.println("Narrowed float to short: " + s3);
		System.out.println("Narrowed long to short: " + s4);
		
		System.out.println("Narrowed double to byte: " + b2);
		System.out.println("Narrowed float to byte: " + b3);
		System.out.println("Narrowed long to byte: " + b4);
		
		

	}

}
