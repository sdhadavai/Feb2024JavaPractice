package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		// How much time your code is taking to execute
		// TC is denoted by BIG O --> O
		
		int i = 10;	//O(1) --> Constant time will be executing only once
		System.out.println(i); //O(1) --> Constant time will be executing only once
		
		for(int k =1; k<=10; k++) {
			System.out.println(k);
		}//O(n)
		// 1 + n + n + n = 3n+1 ==> Linear Equation
		// 3n+1 ==> 3n ==> n ==> O(n)
		System.out.println("---------------");
		int p =1;
		while(p<=10) {
			System.out.println(p);
			p++;
			System.out.println("Hello");
		}
		// 1+n+n+n+n ==> 4n+1 ==> 4n ==> O(n)
		
		// For Both loops 3n+1 + 4n+1 ==> 7n+2 --> Linear Equation
		//7n+2 ==> 7n ==> O(n)
		System.out.println("---------------");
		for(int l=1; l<10; l++) {
			System.out.println(l);
			if(l==5) {
				System.out.println("bye");
				break;
			}
		}//O(n)
		
	// 1 + n + n + n + n + 2 ==> 4n + 2 ==> 4n ==> O(n)
		System.out.println("---------------");
		//Nested loops: mxn times
		for(int t = 1; t<=5; t++) {
			for(int s =1; s<=1; s++) {
				System.out.println(t + " " + s);
			}
		}
		
		//(1+n+n)(1+n+n+n) => (1+2n) (1+3n) => 1+3n+2n+6n^2 => 6n^2+5n+1 --> Quadratic Equation
		//6n^2+5n+1 ==> 6n^2+5n ==> n(6n+5) => 6n^2 ==> O(n^2) --> Excel sheet, Database
		
		System.out.println("---------------");
		//Nested loops: mxn times
		for(int t = 1; t<=5; t++) {
			for(int s =1; s<=1; s++) {
				for(int f=1; f<=5; f++) {
					System.out.println(t + " " + s + " " + f);
				}
				
			}
		}//O(n^3) Cubic equation
		
		//If no of loops are increasing then complexity is increasing that is O(n^k)
		
		int y =1;
		while(y<=10) {
			for(int k=1; k<=10;k++) {
				System.out.println(k);
			}
			y++;
		}//(1+n+n)(1+n+n+n) ==> O(n^2) n power 2
		
		//O(long n) -->
		
	}

}
