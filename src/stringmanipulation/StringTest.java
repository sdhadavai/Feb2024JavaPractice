package stringmanipulation;

public class StringTest {

	public static void main(String[] args) {

		//1. using string literals: Stores in String Constant Pool(SEP) in side the heap from JDK1.7
		//2. using new keyword
		
		String s1 = "Hello";//SCP
		String s2 = new String("Hello");//one obj as already we have Hello in SCP
		String s3 = new String("Naveen");// two objects
		String s4 = "Naveen";//0 objects created
		String s5 = new String("Naveen");
		String s6 = "naveen";
		String s7 = "naveen";
		
		String t1 = "Hello";
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==t1);//true
		System.out.println(s1.equals(t1));//true
		
		
		String r1 = new String("Selenium");//2 objects
		r1 = r1.intern();
	}

}
