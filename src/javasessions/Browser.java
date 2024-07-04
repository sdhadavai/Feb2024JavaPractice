package javasessions;

import java.util.Arrays;

public class Browser {

	public Browser(int a) {
		System.out.println("Value:" + a);

	}

	// Write a function with acceptance criteria
	// Launch a browser: browserName(String) -- i/p param: chrome/ff/safari/edge
	// return: boolean: true/false

	public boolean launchBrowser(String browserName) {
		System.out.println("launching browser -->" + browserName);
		if (browserName.equals("chome")) {
			System.out.println("chrome is launched");
			return true;
		} else if (browserName.equals("firefox")) {
			System.out.println("firefox is launched");
			return true;
		} else if (browserName.equals("edge")) {
			System.out.println("edge is launched");
			return true;
		} else if (browserName.equals("safari")) {
			System.out.println("safari is launched");
			return true;
		} else {
			System.out.println("please pass the right browser name");
			return false;
		}

	}

	public boolean launchAppBrowser(String browserName) {
		System.out.println("launching browser -->" + browserName);
		boolean flag = true;
		switch (browserName) {
		case "chrome":
			System.out.println("Chrome is launched");
			// return true;
			break;
		case "safari":
			System.out.println("safari is launched");
			// return true;
			break;
		case "edge":
			System.out.println("edge is launched");
			// return true;
			break;
		case "firefox":
			System.out.println("firefox is launched");
			// return true;
			break;

		default:
			System.out.println("please pass the right browser name");
			// return false;
			flag = false;
			break;
		}
		return flag;
	}

	// WAF:
	// function name: getStudnetMarks
	// input parm: studentName(String)
	// return: marks(int)

	public int getStudentMarks(String studentName) {
		System.out.println("Getting Student marks : " + studentName);
		int marks = -1;
		switch (studentName) {
		case "arti":
			marks = 90;
			break;
		case "ravi":
			marks = 95;
			break;

		case "kishan":
			marks = 100;
			break;

		case "naveen":
			marks = 10;
			break;

		default:
			System.out.println("Please pass the right student name....");
			break;
		}
		return marks;
	}

	public int[] getData() {
		int num[] = { 10, 20, 30 };
		return num;
	}

	public static void main(String[] args) {

		/*
		 * Browser br = new Browser();
		 * 
		 * boolean flag = br.launchBrowser("chome"); System.out.println(flag); if(flag)
		 * { System.out.println("etner the url:https://google.com"); }else {
		 * System.out.println("no need to enter the url"); }
		 * 
		 * 
		 * if (br.launchAppBrowser("chrome")) {
		 * System.out.println("etner the url:https://google.com"); } else {
		 * System.out.println("no need to enter the url"); }
		 * 
		 * int m1 = br.getStudentMarks("arti"); System.out.println(m1);//90 if(m1>=0 &&
		 * m1<=100) { System.out.println("print the marksheet"); }
		 * 
		 * int m2 = br.getStudentMarks("naveen"); System.out.println(m2);//10
		 * 
		 * int m3 = br.getStudentMarks("tom"); System.out.println(m3);//-1
		 * 
		 * if(m3>=0 && m3<=100) { System.out.println("print the marksheet"); }
		 * System.out.println(Arrays.toString(br.getData()));
		 */

	}

}
