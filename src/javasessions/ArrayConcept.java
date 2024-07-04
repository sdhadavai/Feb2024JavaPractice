package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array: non primitive data type
		//Collection of homogenious (similor) data
		
		//Limitation of Arrays
		//1. Array size is fixed -> Static array: to overcome this problem we have to use dynamic array(ArrayList)
		//2. Can store only similar type of data: to overcome we can use Object array but this is still static array, then we use generic concepts
		
		
		int i[] = new int[4];
		// Low Index = First index = 0;
		//High Index = length - 1 ==> 4 - 1;
		//length = High Index + 1 ==> 3 + 1
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;// ArrayIndexOutOfBoundsException(AIOB)
		System.out.println(i[0]);//10; O(1)
		System.out.println(i[3]);//40;
		//System.out.println(i[4]);// ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);// ArrayIndexOutOfBoundsException
		//System.out.println(i[4]);
		
		
		//Use cases:
		//Month array: 12 --> 0 to 11
		//List of countries: 
		//seats in theater/bus/flight
		
		//length of array
		int len = i.length;
		int hi = len-1;
		int li = 0;
		
		System.out.println("array length: " + len);//4
		System.out.println("hiest Index: " + hi);//3
		System.out.println("lowest Index: " + hi);//0
		
		//Print all value of array
		//Index based loop
		for(int k = 0; k<i.length; k++) { //O(n)
			System.out.println(i[k]);
		}
		
		/*
		 * for(int k = 0; k<=i.length-1; k++) { //O(n) System.out.println(i[k]); }
		 */
		System.out.println("----For each loop-----");
		//for each
		for(int e : i) {
			System.out.println(e);
		}
		
		//double array
		double d[] = new double[3]; // 0 to 2
		d[0] = 12.33;
		d[1] = 10.99;
		d[2] = 23.44;
		System.out.println("----For each loop double-----");
		for(double e : d) {
			System.out.println(e);
		}
		
		//char array:
		char ch[] = new char[3]; // 0 to 2.
		ch[0] = 's';
		ch[1] = 'a';
		ch[2] = 'i';
		System.out.println("----For each loop char-----");
		for(char e : ch) {
			System.out.println(e);
		}
		for(int e : ch) {
			System.out.println(e);//ASCCI values
		}
		
		String empNames[] = new String[3];
		
		empNames[0] = "Srivnas";
		empNames[1] = "Anu";
		empNames[2] = "Soham";
		
		
		System.out.println(empNames[0]);
		System.out.println("------String Array---");
		for(String e : empNames) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(empNames));//[Srivnas, Anu, Soham]
		
		int num[] = new int[4]; //0-3
		System.out.println(num[0]);//0
		System.out.println(num[1]);//0
		System.out.println(num[2]);//0
		System.out.println(num[3]);//0
		
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		System.out.println(num);// memory address of array [I@6d86b085
		System.out.println(num.toString());// memory address of array [I@6d86b085
		System.out.println(Arrays.toString(num));// [100, 200, 300, 400] O(1)
		
		
		
		char ch1[] = new char[4]; //0-3
		System.out.println(ch1[0]);//0
		System.out.println(num[3]);//0
		
		String empNames1[] = new String[3];
		System.out.println(empNames1[1]);//null
		
		
		String names[] = new String[5];
		
		names[0] = "Srivnas";
		names[1] = "Anu";
		names[2] = "Soham";
		names[3] = "Jyothi";
		names[4] = "Sai";
		
		for(String e : names) {
			System.out.println(e);
			if(e.equals("Soham")) {
				System.out.println("HR");
				//break;
			}else if(e.equals("Jyothi")) {
				System.out.println("Admin");
			}
			
		}
		
		int n[] = new int[4];
			
		n[0] = 100;
		n[1] = 200;
		n[2] = 300;
		n[3] = 400;
		System.out.println(Arrays.toString(n));
		for(int e : n) {
			System.out.println(e);
			if(e == 200) {
				System.out.println("Bye");
				break;
			}
		}
		
		//emp data name(String), age(int), salary(double), gender(char), isPerm(bolean)
		
		//Object Array
		
		Object ob[] = new Object[5];
		System.out.println(Arrays.toString(ob));//[null, null, null, null, null]
		ob[0] = "Srinvas";
		ob[1] = 43;
		ob[2] = 250000;
		ob[3] = 'm';
		ob[4] = true;
		System.out.println(Arrays.toString(ob));//[Srinvas, 43, 250000, m, true]
		for(Object e : ob) {
			System.out.println(e);
		}
		
		
		
	}

}
