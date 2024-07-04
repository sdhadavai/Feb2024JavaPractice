package javasessions;

public class IncremnetalDecrementalAssignments {

	public static void main(String[] args) {

		// 1) What will be the output of the following program?
		
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);// 24;
		
		
		//2. Guess the output of the following program?
		
		int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a);//13
		System.out.println("b="+b);//24
		System.out.println("c="+c);//103
				
		//3) What will be the output of the below program?
			int i1=0;
			i1 = i1++ - --i1 + ++i1 - i1--;
			System.out.println(i1);//0
			
		//4) Is the below program written correctly? No, Cannot perform arithmatic operations on boolean
		/*
		 * boolean b1 = true; b1++; System.out.println(b1);
		 */
			
		//5. What will be the output of the below program?
			int i2=1, j=2, k=3;
			int m = i2-- - j-- - k--;
			System.out.println("i="+i2);//0
			System.out.println("j="+j);//1
			System.out.println("k="+k);//2
			System.out.println("m="+m);//-4
			
		//6) What will be the output of the following program?
			int a1=1, b1=2;
			System.out.println(--b1 - ++a1 + ++b1 - --a1);//0
			
		//7) What will be the value of i, j and k in the below program?
			int i3=19, j3=29, k3=0;
			int m3 = i3-- - j3-- - k3--;
			System.out.println("i3="+i3);//18
			System.out.println("j3="+j3);//28
			System.out.println("k3="+k3);//-1
			System.out.println("m3="+m3);//-10
			
		//8) What is wrong with the below program? Why it is showing compilation error?
			int i5 = 11;
			//int j5 = --(i5++);// We cannot apply Incremental and Decremental operators on numerical values directly.
			
		//9) Guess the value of p in the below program?
			int m6 = 0, n6 = 0;
			int p = --m6 * --n6 * n6-- * m6--;
			System.out.println("p:" + p);//1
			System.out.println("m6:" +m6);//-2
			System.out.println("n6:" + n6);//-2
			
		//10) What will be the output of the following program?
			int a2=1;
			a2 = a2++ + ++a2 * --a2 - a2--; 
			System.out.println("a2:" + a2);//5
			
		//11) What will be the outcome of the below program?
			//int a3 = 11++;//Compilation error as we cannot apply Incremental and Decremental operators on numerical values directly.
			//System.out.println(a3);
			
		//12) What will be the outcome of the below program?
			int ch = 'A';
			System.out.println("Value of 'A' is: " + ch++);//65 ASCII value as ch is int type
			
		//13) What will be the outcome of the below program?
			char ch1 = 'A';
			System.out.println("Value of 'A' is: " + ++ch1);//B as ch1 is char
			
		//14) What will be the outcome of the below program?
			double d = 1.5, D = 2.5;
			System.out.println(d++ + ++D);//1.5 + 3.5 = 5.0
			
					
			
		
		
		
	}

	

}
