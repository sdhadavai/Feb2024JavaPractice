package javasessions;

public class LopsAssignments {

	public static void main(String[] args) {

//1. WAP to print following output:
		/*
		 * I am Batman﻿ I am Batman﻿ I am Batman﻿ I am Batman I am Batman
		 */

		for (int i = 0; i < 5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("----------------------");

//2. WAP to print following output:

		/*
		 * I am Batman 1 I am Batman 2 I am Batman 3 I am Batman 4 I am Batman 5 I am
		 * Batman 6 I am Batman 7 I am Batman 8 I am Batman 9
		 */

		for (int i = 1; i <= 9; i++) {
			System.out.println("I am Batman " + i);
		}
		System.out.println("----------------------");

//3. WAP to print 10 to 1 using for, while and do-while loop	

		System.out.println("-----Printing 10 to 1 suing while loop---");

		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("----------------------");
		System.out.println("-----Printing 10 to 1 suing do while loop---");

		int j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);

		System.out.println("----------------------");
//4. Write a program in Java to print "Hello World" ten times using while loop

		int k = 1;
		while (k <= 10) {
			System.out.println("Hello World");
			k++;
		}

		System.out.println("----------------------");

//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop

		System.out.println("Multiplication of 5 using while loop");

		int l = 1;
		while (l <= 100) {
			System.out.println("5 * " + l + " =" + (5 * l));
			l++;
		}

		System.out.println("----------------------");
		System.out.println("Multiplication of 5 using for loop");
		for (int i1 = 1; i1 <= 100; i1++) {
			System.out.println("5 * " + i1 + " =" + (5 * i1));
			i1++;
		}
		System.out.println("----------------------");
		System.out.println("Multiplication of 5 using do while loop");

		int m = 1;
		do {
			System.out.println("5 * " + m + " =" + (5 * m));
			m++;
		} while (m <= 100);
		System.out.println("----------------------");
//6. Print all odd and even numbers between 1 to 100

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				System.out.println(num + " is even no");
			} else {
				System.out.println(num + " is odd no");
			}

		}
		System.out.println("----------------------");
//7. What will be the output of this program:
//Ans: Infinite loop
		/*
		 * int i1 = 1; while(i1<=1){ System.out.println("Hi Java"); }
		 */
//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.

		System.out.println("----Priting A-Z ASCII Values--------");
		for (int c = 'A'; c <= 'Z'; c++) {
			System.out.println("ASCII Value of " + (char) c + " is:" + c);
		}

		System.out.println("----Priting a-z ASCII Values--------");
		for (int c = 'a'; c <= 'z'; c++) {
			System.out.println("ASCII Value of " + (char) c + " is:" + c);
		}

		System.out.println("----Priting 0-9 ASCII Values--------");
		for (char c = '0'; c <= '9'; c++) {
			System.out.println("ASCII Value of " + c + " is:" + (int) c);
		}

		System.out.println("----Priting 0-9 ASCII Values--------");
		for (int c = '0'; c <= '9'; c++) {
			System.out.println("ASCII Value of " + (char) c + " is:" + c);
		}
		System.out.println("----------------------");
		// 9. Print the following series using for and while loops:
		// 9.1 Even Numbers Series: Write a Java program to print the series of even
		// numbers from 2 to 100.
		int num = 2;
		while (num <= 100) {
			System.out.print(num + " ");
			num = num + 2;

		}
		System.out.println();
		System.out.println("----------------------");
		// 9.2 Reverse Alphabet Series: Develop a Java program to print the series of
		// lowercase alphabets in reverse order from 'z' to 'a'.

		char ch = 'z';
		while (ch >= 'a') {
			System.out.print(ch + " ");
			ch--;
		}
		System.out.println();
		System.out.println("----------------------");

		// 9.3 Floating Point Series: Write a Java program to print the series of
		// floating-point numbers from 1.0 to 10.0.
		double d = 1.0;
		while (d <= 10.0) {
			System.out.println(d);
			d++;
		}
		System.out.println("----------------------");

//9.4Multiples of 9 Series: Develop a Java program to print the series of numbers where each number is a multiple of 9, starting from 0 and ending at 99.
		for (int m1 = 0; m1 <= 99; m1 = m1 + 9) {
			System.out.print(m1 + " ");
		}
		
		System.out.println();
		// ----------------- or------------
		for (int m1 = 0; m1 <= 99; m1++) {
			if(m1 %9 == 0) {
				System.out.print(m1 + " ");
			}
			
		}
		
		System.out.println();
		System.out.println("----------------------");
		

		
		
		
//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.

		System.out.println("---Priting vowels using for loop--");
		for (char ch1 = 'a'; ch1<='z';ch1++) {
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' ||ch1=='u') {
				System.out.print(ch1 + " ");
			}
		}
		System.out.println();
		System.out.println("---Priting vowels using while loop--");
		char ch2 = 'a';
		while(ch2<='z') {
			if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' ||ch2=='u') {
				System.out.print(ch2 + " ");
			}
			ch2++;
		}
		System.out.println();
		System.out.println("----------------------");
//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		for(int x=1; x<=10; x++) {
			System.out.print(x + " ");
			if(x % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		
		
		
		
		
		
		
	}

}
