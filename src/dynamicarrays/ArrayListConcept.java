package dynamicarrays;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList: default class: dynamic array
		
		ArrayList ar = new ArrayList();//Vitrtual Capacity(VC) = 10; Physical Capacity(PC)=0;
		System.out.println(ar.size());//0
		ar.add(100);//0th index
		ar.add(200);//1st index
		System.out.println(ar.size());//2

		ar.add(300);//2nd index
		ar.add(400);//3rd index
		System.out.println(ar.size());//4
		
		ar.add(500);//4th index
		ar.add(600);//5th index
		System.out.println(ar.size());//6
		
		System.out.println(ar.get(0));//100
		System.out.println(ar.get(5));//600
		//System.out.println(ar.get(6));//IndexOutOfBoundsException IOBE
		
		ar.add(700);
		System.out.println(ar.get(6));//700
		
		//ArrayList with our own capacity
		ArrayList ar1 = new ArrayList(5);//vc=5; pc=0;
		System.out.println(ar1.size());
		
		ArrayList ar2 = new ArrayList(50);//vc=50; pc=0;
		System.out.println(ar2.size());
		
		
		//use cases: Dynamic data
		//more products coming 
		//more links are adding
		
	}

}
