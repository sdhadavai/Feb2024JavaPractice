package javasessions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b =200;
		
		System.out.println("the value of a: " + a);//the value of a: 100
		System.out.println("the value of b: " + b);//the value of a: 200
		System.out.println("the sum of a and b: " + a+b);//the sum of a and b:100200
		System.out.println("the sum of a and b: " + (a+b));//the sum of a and b:300
		
		//String is a collection of multiple characters which are enclosed in double quotes.
		String x = "hello";
		String y = "world";
		
		//System.out.println(x-y);//Only + is possible for String that is concatination 
		
		System.out.println(a+b);//300
		System.out.println(x+y);//helloworld
		System.out.println(a+x);//100hello
		System.out.println(a+b+x+y);//300helloworld
		System.out.println(x+y+a+b);//helloworld100200
		System.out.println(x+y+(a+b));//helloworld300
		System.out.println(a+b+x+y+a+b);//300helloworld100200
		
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d);//helloworld12.3323.44
		System.out.println(a+b+c+d+x+y);//335.77helloworld
		
		char c1 = 'a';//97
		char c2 = 'b';//98
		
		System.out.println(c1+c2+x+y);//195helloworld
		System.out.println(c1+c2);//195
		System.out.println(c1+""+c2);//ab
		System.out.println(x+" "+y);//hello world
		
		String t1 = "a";
		String t2 = "b";
		
		System.out.println(t1+t2);//ab
		System.out.println(c1+' '+ c2);//227
		
		System.out.println(true+x);//truehello;
		//System.out.println(true+ture);//syntax error
		
		System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);//195helloselenium10020012.33
		

	}

}
