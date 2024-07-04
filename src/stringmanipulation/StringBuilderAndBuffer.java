package stringmanipulation;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		
		//mutable, fast
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Selenium");
		System.out.println(sb);
		
		//slow: 1.1: legacy classes, Syncronized
		StringBuffer sf = new StringBuffer("Testing ");
		sf.append("Cypress");
		System.out.println(sf);
	}

}
