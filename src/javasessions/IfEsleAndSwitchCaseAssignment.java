package javasessions;

public class IfEsleAndSwitchCaseAssignment {

	public static void main(String[] args) {
		
//Q1.a : Find out the greatest number out of three different given numbers:
		
		int num1 = 25;
		int num2 = 78;
		int num3 = 87;
		
		if(num1>num2 & num1>num3) {
			System.out.println("Greatest number is: " + num1);
		}else if(num2>num3) {
			System.out.println("Greatest number is: " + num2);
		}else {
			System.out.println("Greatest number is: " + num3);
		}
		System.out.println("******************************");
		
		
//1.b : Find out the greatest number out of four different given numbers:
		
		int n1 = 25;
		int n2 = 78;
		int n3 = 87;
		int n4 = 97;
		
		if(n1>n2 & n1>n3 & n1>n4) {
			System.out.println("Greatest number is: " + n1);
		}else if(n2>n3 & n2>n4) {
			System.out.println("Greatest number is: " + n2);
		}else if(n3>n4){
			System.out.println("Greatest number is: " + n3);
		}else {
			System.out.println("Greatest number is: " + n4);
			
		}
		System.out.println("******************************");
//Write a Java program to test a number is positive or negative
	
		int inputNumer = 0;
		if(inputNumer>0) {
			System.out.println("Entered number " + inputNumer+ " is postive");
		}else if(inputNumer==0) {
			System.out.println("Entered number " + inputNumer+ " is zero");
		}else {
			System.out.println("Entered number " + inputNumer+ " is negative");
		}
		System.out.println("******************************");
		
//WAP to check number is odd or even using If - Else
		
		int number = 11;
		
		if(number%2 ==0) {
			System.out.println(number + " --> is even number");
		}else {
			System.out.println(number + " --> is odd number");
		}
		System.out.println("******************************");
		
//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		
		char ch = 'A';
		switch (ch) {
		case 'a':
			System.out.println(ch + " is a Vowel");
			break;
		case 'e':
			System.out.println(ch + " is a Vowel");
			break;
		case 'i':
			System.out.println(ch + " is a Vowel");
			break;
		case 'o':
			System.out.println(ch + " is a Vowel");
			break;
		case 'u':
			System.out.println(ch + " is a Vowel");
			break;
		case 'A':
			System.out.println(ch + " is a Vowel");
			break;
		case 'E':
			System.out.println(ch + " is a Vowel");
			break;
		case 'I':
			System.out.println(ch + " is a Vowel");
			break;
		case 'O':
			System.out.println(ch + " is a Vowel");
			break;
		case 'U':
			System.out.println(ch + " is a Vowel");
			break;

		default:
			System.out.println(ch + " is a Consonant");
			break;
		}
		System.out.println("******************************");
		
//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
		String env = "uat";
		
		switch (env.trim().toLowerCase()) {
		case "qa":
			System.out.println("Running test cases in " + env + " environemnt");
			break;
		case "stage":
			System.out.println("Running test cases in " + env + " environemnt");
			break;
		case "dev":
			System.out.println("Running test cases in " + env + " environemnt");
			break;
		case "uat":
			System.out.println("Running test cases in " + env + " environemnt");
			break;
		case "prod":
			System.out.println("Running test cases in " + env + " environemnt");
			break;

		default:
			System.out.println(env + " is not a valid environemnt please correct");
			break;
		}
		System.out.println("******************************");
		
//WAP to book the specific type of car from the Uber app using Switch - Case. 
//Car Type: Mini, Sedan, SUV, Premium
//If user passes wrong car type, print please select the right car type		
		
		String carType = "suvd";
		switch (carType.trim().toLowerCase()) {
		case "mini":
			System.out.println("your booking confirmed with Uber " + carType);
			break;
		case "sedan":
			System.out.println("your booking confirmed with Uber " + carType);
			break;
		case "suv":
			System.out.println("your booking confirmed with Uber " + carType);
			break;

		default:
			System.out.println("Please select the correct car type!");
			break;
		}
		System.out.println("******************************");
//WAP to launch browsers using If-ElseIf and Switch Case.
//Browser: Chrome/Firefox/IE/Safari
//If user passes wrong browser, print please pass the right browser name
		
		String browser = " SaFaRi ";
		//using If Else
		System.out.println("-----Launcging browser using If Else if -------");
		if(browser.trim().equalsIgnoreCase("chrome")){
			System.out.println("launching " + browser + " browser");
		}else if (browser.trim().equalsIgnoreCase("firefox")){
			System.out.println("launching " + browser + " browser");
		}else if(browser.trim().equalsIgnoreCase("ie")){
			System.out.println("launching " + browser + " browser");
		}else if(browser.trim().equalsIgnoreCase("safari")){
			System.out.println("launching " + browser + " browser");
		}else {
			System.out.println("Please pass the right browser name!");
		}
		//using switch case
		System.out.println("-----Launcging browser using Switch case -------");
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launching " + browser + " browser");
			break;
		case "firefox":
			System.out.println("launching " + browser + " browser");
			break;
		case "ie":
			System.out.println("launching " + browser + " browser");
			break;
		case "safari":
			System.out.println("launching " + browser + " browser");
			break;

		default:
			System.out.println("Please pass the right browser name!");
			break;
		}
		System.out.println("******************************");
//WAP to define the interest rate on the basis of Loan type using Switch Case
//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		String loanType = "car loan";
		double salary = 34000;
		double intersetRate = 0.0;
		switch (loanType.trim().toLowerCase()) {
		case "car loan":
			intersetRate = 9.73;
			break;
		case "housing loan":
			intersetRate = 7.90;
			if(salary<=35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan as your salary is less than 35k");
			}
			break;
		case "personal loan":
			intersetRate = 15.5;
			break;
		case "education loan":
			intersetRate = 7.25;
			break;

		default:
			System.out.println("Plesae enter valid load type");
			break;
		}
		System.out.println("Interest rate for " + loanType + " is " + intersetRate + "%");
		System.out.println("******************************");
		
	}

}
