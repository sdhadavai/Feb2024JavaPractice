package dataconversion;

public class DataConvert {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);//10020
		
		//String to int: using Wrapper Class: Integer
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);//120
		
		String t = "200A";
		
		//int j = Integer.parseInt(t);
		//System.out.println(j+20);//NumberFormatException NFE
		
		t = t.replace("A", "");
		int j = Integer.parseInt(t);
		//System.out.println(j+20);
		
		String y = "12.33";
		System.out.println(y+20);//12.3320
		
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//String to boolean
		String execute = "true";
		boolean flag = Boolean.parseBoolean(execute);
		if(flag) {
			System.out.println("Run my test cases");
		}else {
			System.out.println("Exist");
		}
		
		//int to String
		int p = 200;
		System.out.println(p+20);
		String pr = String.valueOf(p);//"200"
		System.out.println(pr+20);//20020
		
		System.out.println(p+""+20);
		
		//boolean to String
		boolean fg = true;
		String f = String.valueOf(fg);//"True"
		System.out.println(f.length());//4
		
		
		String tr = ""; //blank and empty
		System.out.println(tr.isBlank());//true
		System.out.println(tr.isEmpty());//true
		
		String tr1 = " "; //blank
		System.out.println(tr1.isBlank());//true
		System.out.println(tr1.isEmpty());//false
		
		String tr2 = "     "; //blank
		System.out.println(tr2.isBlank());//true
		System.out.println(tr2.isEmpty());//false
		
		String tr3 = "     v"; //no blank and no empty
		System.out.println(tr3.isBlank());//false
		System.out.println(tr3.isEmpty());//false
		

	}

}
