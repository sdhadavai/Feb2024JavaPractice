package javasessions;

public class IncrementDecrementTest {

	public static void main(String[] args) {

		int i = 11;
		int j = i++ + ++i;
				//11 + 13
		System.out.println(j);//24
		System.out.println(i);//13;
		
		int a = 11, b = 22, c;
		c= a + b + a++ + b++ + ++a + ++b;
		
		// 11 + 22 + 11 + 22 + 13 + 24
		System.out.println("a:"+ a);//13
		System.out.println("b:" + b);//24
		System.out.println("c:" + c);//103
		
		int i1 = 0;
		int j1 = i++ - --i + ++i - i--;
		// 0 - 0 + 1 - 1
		System.out.println(i1);//0
		System.out.println(j1);//0
		
		int i2 = 1, j2 = 2, k2 = 3;
		int m2 = i2-- - j2-- - k2--;
			//m2 = 1 - 2 - 3 ==> -4
		System.out.println("i2:" + i2);//0
		System.out.println("j2:" + j2);//1
		System.out.println("k2:" + k2);//2
		System.out.println("m2:" + m2);//-4
		
		int a1=1, b1=2;
		int m3 = --b1 - ++a1 + ++b1 - --a1;
		//1 - 2 + 2 - 1 ==> 0
		System.out.println("m3:"+m3);//0
		System.out.println("a1:"+a1);//1
		System.out.println("b1:"+b1);//2
		
		int f=0, g=0;
		int l = --f * --g * g-- * f--;
		//-1 * -1 * -1 * -1
		
		System.out.println("l:"+l);//1
		System.out.println("f:"+f);//-2
		System.out.println("g:"+g);//-2
		
		
		int ch = 'A';
		System.out.println(ch++);//65
		System.out.println(ch);//66
		
		char ch1 = 'A';
		System.out.println(ch1++);//A
		System.out.println(ch1);//B
		
		char c2 = 'A';
		System.out.println(++c2);//B
		System.out.println(c2);//B
		
		
		double d = 1.5, D=2.5;
		double f1 = d++ + ++D;
		System.out.println(d);//2.5
		System.out.println(D);//3.5
		System.out.println(f1);//5.0
	}

}
