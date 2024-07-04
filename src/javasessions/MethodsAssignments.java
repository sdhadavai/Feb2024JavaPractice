package javasessions;

public class MethodsAssignments {

	// 1.Write a program to print the addition/subtraction/division/multiplication
	// of two numbers by defining your own method

	// addition without return type and without parameters

	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("Addition of " + a + " and " + b + " is:" + (a + b));
	}

	// subtraction without return type and with parameters
	public void subtraction(int a, int b) {
		System.out.println("Subtraction of " + a + " and " + b + " is:" + (a - b));
	}

	// multiplication with return type without paramets
	public int multiplication() {
		int a = 10;
		int b = 20;
		int mul = a * b;
		return mul;
	}

	// division with return type and with parameters

	public double div(int a, int b) {
		double d = a / b;
		return d;
	}

	// 2. Define a method that returns the product of two double numbers.

	public double product(double a, double b) {
		return a * b;

	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method. 

	public void areaOfCircle(double radius) {

		System.out.println("Circle of area for " + radius + " radius is: " + (Math.PI * radius * radius));

	}

	public void circumferenceOfCircle(double radius) {

		System.out.println("Circumferenceof area for " + radius + " radius is: " + (2 * Math.PI * radius));

	}

	public void diameterOfCircle(double radius) {

		System.out.println("Diameter area for " + radius + " radius is: " + (2 * radius));

	}

	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers.

	// max no

	public int findMax(int a, int b, int c) {
		int maxNo = 0;

		if (a > b & a > c) {
			maxNo = a;
		} else if (b > a & b > c) {
			maxNo = b;
		} else {
			maxNo = c;
		}

		return maxNo;

	}

	// min no
	public int findMin(int a, int b, int c) {
		int maxNo = 0;

		if (a < b & a < c) {
			maxNo = a;
		} else if (b < a & b < c) {
			maxNo = b;
		} else {
			maxNo = c;
		}

		return maxNo;

	}

//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.

	public boolean findEvenOdd(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
//6. A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to﻿ vote. - return true/false

	public boolean checkVoteEligible(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

//7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
	/*
	 * Marks        Grade 91-100         AA 81-90          AB 71-80          BB﻿
	 * 61-70          BC 51-60          CD 41-50          DD <=40          Fail
	 */

	public String finndStudnetGrade(int marks) {

		String grade = "No Grade";
		if (marks >= 91 & marks <= 100) {
			grade = "AA";
		} else if (marks >= 81 & marks <= 90) {
			grade = "AB";
		} else if (marks >= 71 & marks <= 80) {
			grade = "BB";
		} else if (marks >= 61 & marks <= 70) {
			grade = "BC";
		} else if (marks >= 51 & marks <= 60) {
			grade = "CD";
		} else if (marks >= 41 & marks <= 50) {
			grade = "DD";
		} else if (marks >= 0 & marks <= 40) {
			grade = "FAIL";
		} else {
			System.out.println("Please enter valid marks you have entered " + marks);

		}

		return grade;
	}

	// 8. Write a program to print the factorial of a number by defining a method
	// named 'Factorial'.

	public int fact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}

	public class Factorial {
		public static int factorial(int n) {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * factorial(n - 1);
			}
		}

		public static void main(String[] args) {
			MethodsAssignments ms = new MethodsAssignments();
			// 1
			ms.add();
			ms.subtraction(40, 20);
			int result = ms.multiplication();
			System.out.println("Multiplication result is:" + result);
			int a = 10;
			int b = 2;
			double divition = ms.div(a, b);
			System.out.println("Divition of " + a + " by " + b + " is:" + divition);

			// 2
			double product = ms.product(10.5, 11.5);
			System.out.println("Prodcut of two no is:" + product);

			// 3
			ms.areaOfCircle(6.6);
			ms.diameterOfCircle(3);
			ms.circumferenceOfCircle(3);

			// 4
			int x = 10, y = 20, z = 30;
			int maxNo = ms.findMax(x, y, z);
			System.out.println("Max no from " + x + ", " + y + ", and " + z + " is:" + maxNo);

			int minNo = ms.findMin(x, y, z);
			System.out.println("Min no from " + x + ", " + y + ", and " + z + " is:" + minNo);

			// 5.
			System.out.println(ms.findEvenOdd(6));
			// 6
			System.out.println(ms.checkVoteEligible(9));
			// 7
			String grade = ms.finndStudnetGrade(40);
			System.out.println("Your Grage is: " + grade);
			System.out.println("Factorial no is:" + ms.fact(3));
		}
	}

}
