package javasessions;


public class DataTypesAssignment {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to add two strings:
		 * 
		 * String a = “Hello”;
		 * String b = “Naveen K”
		 * 
		 * Expected Output :Hello Naveen K
		 */
				
		String message = "Hello";
		String name = "Naveen K";
		System.out.println(message + " " + name);
				

		/*
		 * 2. Write a Java program to print the sum of two numbers.
		 * Test Data:
		 * 74 + 36
		 * Expected Output:110
		 */
		int firstNumber = 74;
		int secondNumber = 36;
		int sum =firstNumber+secondNumber;
		System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is:" + sum);
		
		/* 3. Write a Java program to print the division of two numbers.
		k = 50/3
		Expected Output : 
		43 
		16 — correct one
		19
		13
		*/
		double result = 50/3;
		System.out.println(result);
		
		/*
		 * 4. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor. 
		 * Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - * 4.5))  
		 * Expected Output 2.138888888888889
		 */
		
		//System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5  - 4.5));
		double num = (25.5 * 3.5 - 3.5 * 3.5) / (40.5  - 4.5);
		System.out.println(num);
		
		//5. Try to concat "Hello Selenium" with a character 't'.
		String name1 = "Hello Selenium";
		char c = 't';
		System.out.println(name1 + " "+ c);
		
		//6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		//"Your Total  amount is: 3700".
		
		int number1 = 100;
		int number2 = 200;
		int number3 = 3400;
		int totalAmount = number1+number2+number3;
		System.out.println("Your Total amount is: " + totalAmount);
		
		// 7.Print the ASCII value of the character 'h'.
		int c1 = 'h';
		System.out.println((byte)c1);
		
		//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		
		int c2 = 'd';//100
		int c3 = 3;
		int sum1 = c2+c3;
		System.out.println("ASCCI value is:"+(char)sum1);//g
		
		//9. Write a program to find the square of the number 3.9.
		
		double num2 = 3.9;
		System.out.println("Square of " + num2 + " is:" + num2*num2);
		// or
		System.out.println("Square of " + num2 + " is:" + Math.pow(num2, 2));
		
	}

}
