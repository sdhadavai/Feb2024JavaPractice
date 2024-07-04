package stringmanipulation;

public class StringReverseTest {
	
	
	public static String reveseString(String s) {
		
		if(s == null) {
			return s;
		}
		
		if(s.isBlank() || s.isEmpty()) {
			return s;
		
		}
		int len = s.length();
		
		if(len ==1) {
			return s;
		}else {
		String reverseString = "";
		
		for(int i = len-1; i>=0; i--) {
			reverseString = reverseString + s.charAt(i);
		}
		//return reverseString;
		return reverseString.trim();
		}
	}
	

	public static void main(String[] args) {
		
		//Test Cases:
		String s = "Selenium automation";
		System.out.println(reveseString(s));
		System.out.println(reveseString("t"));
		System.out.println(reveseString("testing"));
		System.out.println(reveseString("testing automation"));
		System.out.println(reveseString(""));
		System.out.println(reveseString(null));
		System.out.println(reveseString("123"));
		System.out.println(reveseString("t "));
		System.out.println(reveseString("null"));
		
		

	}

}
