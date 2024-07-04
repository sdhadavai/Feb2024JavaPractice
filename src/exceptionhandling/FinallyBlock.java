package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {

System.out.println("A");
try {
	int i=9/0;
}catch (ArithmeticException e) {
	e.printStackTrace();
	
}finally {
	System.out.println("Finally Block");
	//close browser
	//disconnect DB
	//close the connection with excel/csv/test/file
}
System.out.println("Bye");

	//1. connection with DB: un/pwd/ip:port
	//2. hit the SQL query
	//3. try-catch --> get the result
	//4. storing the result
	//5. use the data in your script
	//6. finally block --> Close DB connection

	}

}
