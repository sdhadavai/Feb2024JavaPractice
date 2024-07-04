package javasessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {

		//++ and --
		
		//1. Post Increment: First assign and then increase
		
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int h = -99;
		int g = h++;
		System.out.println(h);//-98
		System.out.println(g);//-99
		
		int s = 5;
		System.out.println(s++);//5
		System.out.println(s);//6
		
		int t = 10;
		int f = t++;
		System.out.println(t);//11
		System.out.println(f);//10
		System.out.println(t);//11
		
		int t1 = 10;
	
		System.out.println(t1);//10
		int f1 = t++;
		System.out.println(f1);//10
		System.out.println(t1);//11
		
		
		//2. Pre Increment: First increment and then assign
		
		int x = 1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int u = -999;
		int p = ++u;
		System.out.println(u);//-998
		System.out.println(p);//-998
		
		int total = 10;
		System.out.println(++total);//11
		System.out.println(total);//11
		
		int m1 = 0;
		int n1 = ++m1;
		System.out.println(m1);
		System.out.println(n1);
		
		//3. Post Decrement: First assign then decrease
		int p1 = 2;
		System.out.println(p1);//2
		int q1 = p1--;
		System.out.println(p1);//1
		System.out.println(q1);//2
		
		int v = -999;
		int k = v--;
		System.out.println(v);//-1000;
		System.out.println(k);//-999
		
		//4. Post Decrement: First decrement and then assign
		
		int o = 2;
		int d = --o;
		System.out.println(o);//1
		System.out.println(d);//1
		
		int pop = 10;
		System.out.println(--pop);//9
		System.out.println(pop);//9
		
		int bill = -1000;
		int finalBill = --bill;
		System.out.println(bill);//-1001
		System.out.println(finalBill);//1001
		
		int th = 5;
		System.out.println(th--);//5
		System.out.println(th);//4
		
		
		

	}

}
