package javasessions;

public class Casting {

	public static void main(String[] args) {
		
		byte a = 100;
		byte b = 10;
		//byte c = a+b; // range could cross the byte range when data is dynamic, Java ask us to save in int/long
		//short c = a+b;// range could cross the byte range when data is dynamic, Java ask us to save in int/long
		int c = a+b;
		long d = a+b;
		System.out.println(c);
		
		//byte d = a - b;
		int e = a - b;
		
		short s1 = 100;
		short s2 = 200;
		
		//short s3 = s1+s2;//range could cross the short range when data is dynamic, Java ask us to save in int/long
		int s3 = s1+s2;
		
		int i = 200;
		int j = 300;
		int k = i+j;
		
		byte g = 10;
		int u = g;//widening
		
		int r1 =100;
		//byte r2 = r1;//narrowing. Cannot convert from int to byte.
		byte r2 = (byte)r1;//casting
		System.out.println(r2);
		r1 = 200;
		r2 = (byte)r1;//casting
		System.out.println(r2);//losing data. -56
		
		char c1 = 'a';
		byte b1 = (byte)c1; 
		System.out.println(b1);//97
		//byte b2 = (int)c1; //not possible
		int b2 = (int)c1;
		byte b3 = (byte)(int)c1;//double casting
		
		double dr = 12.33;
		int tr = (int)dr;
		System.out.println(tr);//12
		
		dr=1112.33;
		byte tr2 = (byte)dr;
		System.out.println(tr2);//88 losing data
		
		char c4 = 'c';//99
		char c5 = 'd';//100
		
		System.out.println(c4*c5);//9900
		System.out.println(c4+c5);//199
		System.out.println(c4-c5);//-1
		System.out.println(c4/c5);//0
		//sapce: 32
		System.out.println(c4+" "+ c5);//c d
		System.out.println(c4+' '+ c5);//231
		System.out.println(' '+ ' ');//64
		System.out.println(" "+ ' ');//  (two spaces)
		System.out.println(' '+ "");//  (two spaces)
		System.out.println((byte)1000);//-24
		System.out.println(' '+ ' '+ ' '+ " ");//96 (96 with single space)
		System.out.println((' '+ ' ')+ "  " );//64 (64 with double space)
		System.out.println(c4+""+ c5);//cd
		
		int a1 = (byte)146;
		System.out.println(a1);//-110;
		
		double dw = 12.33;
		char cw = (char)dw;//12
		System.out.println(cw);// no output as there is no number respective ASCCII no.
		
		dw = 97.33;
		cw = (char)dw;//97
		System.out.println(cw);//a
		
				

	}

}
