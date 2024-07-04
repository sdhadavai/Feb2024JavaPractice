package exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		//throw is used to delibatrly i want to throw my own exception
		
		String data = null;
		if(data == null) {
			//want to throw my own exception
			throw new RuntimeException("Data NOT FOUND");
		}
		System.out.println("fill the form");

	}
	
	//try-catch
	//throw vs Throws??
	//finally block

}
