package exceptionhandling;

public class Testing {

	public static void main(String[] args) {

		int a[] = new int[3];//0 to 2
		try {
		a[3] = 10;//AIOB -- RunTime Exception
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//Business logic: should not write in try catch block
		System.out.println("Bye");
		

	}

}
