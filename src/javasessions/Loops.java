package javasessions;

public class Loops {

	public static void main(String[] args) {

		// 1. while loop
		// 1 to 10;

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			if (i == 5) {
				System.out.println("Bye");
				break;// breaks entire loop and comes out of loop
			}
			i++;
			// ++i;
			// i=i+1;
		}

		/*
		 * while (true) {// bad way of writing program, but some cases we use eg.
		 * display welcome message // at hotel entrance
		 * System.out.println("Welcome to Holtel Taj");
		 * 
		 * }
		 */
		System.out.println("----------------");
		int t = 10;
		while (t >= 0) {
			System.out.println(t);
			t--;
			// --t;
			// t = t-1;
		}
		System.out.println("----------------");
		//2. For loop
		// 1 to 10
		/*
		 * for(int k = 1; k<=10; k++) { System.out.println(k); }
		 */
		
		/*
		 * int k =1; for(; k<=10; k++) { System.out.println(k); }
		 */
		
		/*
		 * for(int k = 1; k<=10; ) { System.out.println(k); k++; }
		 */
		/*
		 * int k =1; for(; k<=10; ) { System.out.println(k); k++; }
		 */
		/*
		 * int k; for(k = 1; k<=10; k++) { System.out.println(k); }
		 */
		
		/*
		 * for(int k = 1; k<=10; k++) { System.out.println(k);//1 break; }
		 */
		
		for(int k = 1; k<=10; k++) {
			System.out.println(k);//12345bye
			if(k==5) {
				System.out.println("bye");
				break;
			}
			
		}
		
		System.out.println("-----------------");
		
		for(double d =1.0; d<=5.0; d++) {
			System.out.println(d);// 1.0, 2.0, 3.0, 4.0, 5.0
		}
		
		System.out.println("-----------------");
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println(ch);//a to z
		}
		
		System.out.println("-----------------");
		for(int ch = 'a'; ch<='z'; ch++) {
			System.out.println(ch);//97 to 122
		}
		
		System.out.println("-----------------");
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println((int)ch);//97 to 122
		}
		
		System.out.println("-----------------");
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println(ch+0);//97 to 122
		}
		
		//a = 97
		//b =98
		
		System.out.println("-----------------");
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println(ch + "=" + (int)ch);//97 to 122
		}
		
		System.out.println("-----------------");
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch + "=" + (int)ch);//97 to 122
		}
		System.out.println("-----------------");
		for(char ch = '0'; ch<='9'; ch++) {
			System.out.println(ch + "=" + (int)ch);//97 to 122
		}
		
		/*
		 * System.out.println("-----------------"); for(;;) {
		 * System.out.println("Helloooooo");//infinite loop }
		 */
		
		/*
		 * System.out.println("-----------------"); for(;true;) {
		 * System.out.println("Helloooooo");//infinite loop }
		 */
		System.out.println("-----------------");
		for(float b=1.3f; b<=4.6; b++) {
			System.out.println(b);
		}
		
		System.out.println(10>5);//true
		System.out.println(10!=5);//true
		
		//difference between for and while
		//While loop use case: When we know number of iterations/cycles are not fixed
		//1. wait for element on the page.
		//2. wait for page loading.
		//3. Dynamic tables
		//4. Web table paginations
		//5. Calendar handling
		//6. carousel handling
		//7. page scrolling: linkedin, swiggy, zomato
		
		//for loop use cases:  When we know number of iterations/cycles are fixed
		
		//1. month drop down.
		//2. week drop down.
		//3. radio buttons, check boxes
		//4. arrays, arraylist
		//5. footer of the page
		//6. Menu Sub Menu Items
		
		//do while: At least one time statement will be executed before condition
		// 1 to 10;
		
		System.out.println("-----------------");
		int p = 1;
		do {
			
			System.out.println(p);//1 to 10
			p++;
		} while (p<=10);
		System.out.println("-----------------");
		int p1 = 1;
		do {
			p1++;
			System.out.println(p1);//2 4 6 8 10
			p1++;
		} while (p1<=10);
		
		System.out.println("-----------------");
		int p2 = 11;
		do {
			p2++;
			System.out.println(p2);//11
			p2++;
		} while (p2<=10);
		
		System.out.println("-----------------");
		int p3 = 1;
		do {
			p3++;
			System.out.println(p3);// 2 to 11
			
		} while (p3<=10);
		
		System.out.println("-----------------");
		int p4 = 1;
		do {
			p3++;
			System.out.println(p3);// 2
			break;
		} while (p3<=10);
		
		//Use Cases
		//1. IF element is already present on the page, check it and click on it and exit otherwise check condition check until element present . Eg Logo, any product
		
		//for-each
		//streams with lambda
		
		
		
		
		
	}

}
