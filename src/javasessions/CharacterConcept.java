package javasessions;

public class CharacterConcept {

	public static void main(String[] args) {

		char c1 = 'a';//97
		char c2 = 'b';//98
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1+c2);//97+98=195
		//whenever we perform calculation on char it will consider as ASCII value
		System.out.println(c2-c1);//1
		
		//To get ASCII value of the chars
		System.out.println((byte)c1);
		System.out.println(0+c1);
		System.out.println(0+'a');
		System.out.println((0+'$'));
		System.out.println((byte)('$'));
		System.out.println((int)'$');//memory managment
		
		char c5 = 97;
		System.out.println(c5);// a
		System.out.println((byte)c5);//97
		
	
		
		int a = 100;
		int b = 200;
		//System.out.println(a+b);

	}

}
