package stringmanipulation;

public class StringImmutabilityConcept {

	public static void main(String[] args) {

		//Cannot change the value
		
		String s = "Hello";
		System.out.println(s + " Selenium");
		System.out.println(s);
		
		s = s + " Selenium";
		System.out.println(s);
		String t = "Hello";
		System.out.println(t);
		
		
		int i = 10;
		i = i+20;
		System.out.println(i);//30

	}

}
