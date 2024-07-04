package javasessions;

public class DataTypes {

	public static void main(String[] args) {

		//data types
		//Strict data type
		
		// 2 types
			//1. Primitive: No need to create the object and it will take some fixed in memory size
		
				// 1. Numeric Type
					//a. Integral value
						//a.1: integer: byte, short, int, long
						//a.2: floating-type: float, double
					//b. Character:
				//2. Boolean type: true/false
		
		
		
		
		
			//2. Non Primitive. Need to create the object (oops) --- class, arrays, interface, String
		
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range:  -128 to 127
		byte b = 10;
		b =20;
		System.out.println(b);
		byte h =30;
		byte j = -10;
		byte j1 = 0;
		// When we have small no we go for byte. eg. age, marks, months
		
		//2. Short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		
		short s = 1000;
		
		//3. int
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		
		int i = 50000;
		
		//4. long:
		//size: 8 bytes = 16 bits
		//range: 
		// population of India, distance bt. earth and space, hear on head, wourld population, carona cases
		long t = 1000000000;
		long t1 = 2344444444444434844L;
		System.out.println(t1);
		
		//we use String class for tel, SSN, Aadhar, card, acc no, CC, postal code as we are not performing any calculations
		
		// We use Big Decimal, Big integer when we have large no than long
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: precetion(after .) upto 7 digits can be taken 
		
		float r = 12.33f;
		System.out.println(r);
		float r1 = (float)34.44;
		System.out.println(r1);
		
		//6. double
		//size: 8 bytes = 64 bits
		//range: precetion(after .) upto 15 digits can be taken 
		double d = 12.4554;
		double d1 = 324.343d;
		double d2 = 32.53f;
		
		// We use Big decimal and Big double if precition is more than 15
		
		//We can store floating no in double as double is big no.
		
		//7. Character: Single digit: Unicode: ASCII values
		//size: 2 bytes = 16 bits
		//range: a to z(97 to 122); A to Z(65 to 90); 0 to 9(48 to 57);
		char c1 = 'a';
		char c2 = 'A';
		char c3 = '3';
		//char c4 = '-1'; // not possible
		char c4 = '$';
		System.out.println(c4);
		
		char gender = 'm';
		char exe = 'y';
		char grade = 'P';
		
		
		//8. boolean
		//range: true/false
		//size: 1 bit (around 1 bit)
		boolean bg = true;
		boolean flag = false;
		//boolean f = 100;
		//Expected Vs Actual in selenium
		// true and false are not keywords these are boolean literals

	}

}
