package exceptionhandling;

public class Student {
	
	public static int getMarks(String name) {
		System.out.println("getting marks for:" + name);
		if(name.equals("Ravi")) {
			
			try {
				int i=9/0;
				System.exit(1);//shutdown JVM
				return 50;
			}catch(ArithmeticException e){
				System.out.println("AE is coming");
				return 20;
			}finally {
				System.out.println("finally block");
				return 80;
			}
			
		}else if(name.equals("tom")) {
			return 80;
		}else if(name.equals("nveen")) {
			return 10;
		}else {
			System.out.println("Student not found");
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println(getMarks("Ravi"));

	}

}
