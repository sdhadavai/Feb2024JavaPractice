package stringmanipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "This is my java code and i am so happy i enjoy coding";
		
		System.out.println(str.length());
		System.out.println("Lowest Index: " + 0);
		System.out.println("Heihest Index: " + (str.length()-1));
		
		System.out.println(str.charAt(0));//T
		System.out.println(str.charAt(8));//m
		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundException
		//System.out.println(str.charAt(38));//SIOFBE
		
		System.out.println(str.indexOf('T'));//0
		System.out.println(str.indexOf('i'));//2: first occurance of i
		System.out.println(str.indexOf('i', (2+1)));//5: 2nd occurance of i
		
		System.out.println("Second occurance of 'i' is:" + str.indexOf('i', str.indexOf('i')+1));
		System.out.println("Third occurance of 'i' is:" + str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
		System.out.println("Fourth occurance of 'i' is:" + str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1));
		
		
		System.out.println(str.indexOf("java"));//11
		
		System.out.println(str.indexOf("Naveen"));//-1
		
		String msg = "welcome admin";
		if(msg.indexOf("admin")==8) {
			System.out.println("User name is present");
		}else {
			System.out.println("user name is not found");
			
		}
		
	
		
		String test = "selenium automation";
		String pop = "SELENIUM";
		System.out.println(test.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		String un = "    test automation  ";
		System.out.println(un.trim());
		
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		String loop = "I love testing";
		System.out.println(loop.replaceAll("love", "enjoy"));
		
		System.out.println("automation".replace("a", "P"));
		
		String mesg = "welcome admin";
		System.out.println(msg.contains("admin"));
		
		String url = "https://naveenautomationlabs.com/macbook";
		System.out.println(url.contains("macbook"));
		
		String t1 = "Hello Selenium";
		String t2 = "Hello selenium";
		System.out.println(t1.equals(t2));
		System.out.println(t2.equalsIgnoreCase(t1));
		
		//split
		
		String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
		String lg[] = (lang.split("_"));
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));
		
		String data = "xXTestingXxXSeleniumXXxXAutomationxXxJavaX";
		String[] d = data.split("xX");
		System.out.println(d[0]);//no output
		System.out.println(d[0].length());//0
		System.out.println(d[1]);//no output
		System.out.println(Arrays.toString(d));
		
		String rest = "testing | automation | cypress | selenium";
		String[] r = rest.split("\\|");
		System.out.println(r[0]);//testing
		System.out.println(r[1]);// automation 
		
		String pest = "testing.automation.cypress.selenium";
		String[] p = pest.split("\\.");
		System.out.println(p[0]);
		
		String emp = "Tom;Peter;30;IBM;Bangalore;India";
		String[] e = emp.split(";");
		System.out.println(e[0]);
		
		String word = "I love \"java\" coding";
		//Expected is I love "java" coding
		System.out.println(word);
		

		String w = "I love 'Java' coding";
		System.out.println(w);
		
		String xpath = "//input[@id=\"firstname\"]";
		System.out.println(xpath);
		
		String x = "//input[@=first\\name]";
		System.out.println(x);
		
		
	}

}
