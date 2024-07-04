package javasessions;

import java.util.Arrays;

public class ArrayAssignments {

	public static void main(String[] args) {
		/*
		 * Q1: WAP to delete a specific number from the given array. int p[] =
		 * {1,4,5,2,3,22,31, 2}; --Need to remove 22 from the p[] array. --output should
		 * be: [1, 4, 5, 2, 3, 31, 2]
		 */

		int[] p = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int[] a = new int[p.length - 1];
		int j = 0;
		for (int i = 0; i < p.length; i++) {

			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}

		}

		System.out.println(Arrays.toString(a));

		System.out.println("----------------");

		/*
		 *  Q2: Write a program to create a static Array, having following cricket data:
		 * --name, age, team name, DOB, gender, Strike Rate         --Try to create
		 * multiple Object Arrays for different players         --Try to print all the
		 * values of each player on the console using for and for each loops
		 */

		Object[] obj = { "Srivnas", 44, "Hyd Champs", "02/10/1980", 'M', "79.99%" };
		Object[] obj1 = { "Srikanth", 33, "Chennai Kings", "11/23/1999", 'M', "54.89%" };
		Object[] obj2 = { "Anu", 12, "Namma Blure", "08/11/20101", 'F', "99.99%" };

		System.out.println("----Displaying cricketer details using for loop----");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println("----------------");
		for (int i = 0; i < obj1.length; i++) {
			System.out.println(obj1[i]);
		}
		System.out.println("----------------");
		for (int i = 0; i < obj2.length; i++) {
			System.out.println(obj2[i]);
		}

		System.out.println("----------------");
		System.out.println("----Displaying cricketer details using for each loop----");

		for (Object e : obj) {
			System.out.println(e);
		}
		System.out.println("----------------");
		for (Object e : obj1) {
			System.out.println(e);
		}
		System.out.println("----------------");
		for (Object e : obj2) {
			System.out.println(e);
		}
		System.out.println("----------------");

//Q3: Print all the elements of this array using for, for each, while and do-while loop:

		int c[] = { 1, 3, 4, 5, 22, 56, 89, 90 };

		System.out.println("---- Priting arry elements using for loop --------");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("---- Priting arry elements using for each loop --------");
		for (int e : c) {
			System.out.print(e + " ");
		}

		System.out.println();
		System.out.println("---- Priting arry elements using while loop --------");
		int k = 0;
		while (k < c.length) {
			System.out.print(c[k] + " ");
			k++;
		}
		System.out.println();
		System.out.println("---- Priting arry elements using do while loop --------");
		int l = 0;
		do {
			System.out.print(c[l] + " ");
			l++;
		} while (l < c.length);
		System.out.println();
		System.out.println("-----------------");

//Q4: Print all the elements of this array in reverse order using for, for each, while and do-while loop:

		int r[] = { 1, 3, 4, 5, 22, 56, 89, 90 };

		System.out.println("---- Priting arry elements in revers order using for loop --------");
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(r[i] + " ");
		}
		System.out.println();
		
		  System.out.
		  println("---- Priting arry elements in revers order using for each loop --------"
		  ); 
		  int count = r.length-1;
			for(int e : r) {
				e=count;
				System.out.print(r[e] + " ");
				count--;
			}
		  System.out.println(); 
		  System.out.println("---- Priting arry elements in revers order using while loop --------"); 
		  int k1 = r.length-1; 
		  while (k1 >=0) { 
			  System.out.print(r[k1] + " "); 
			  k1--; 
			  }
		  System.out.println(); 
		  System.out.println("---- Priting arry elements in revers order using do while loop --------"); 
		  int l1 = c.length-1; 
		  do { 
			  System.out.print(r[l1] + " "); 
			  l1--; 
			  } while (l1 >=0); 
		  System.out.println(); System.out.println("-----------------");
		 

	}

}
