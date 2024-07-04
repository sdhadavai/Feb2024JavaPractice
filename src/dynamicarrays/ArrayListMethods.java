package dynamicarrays;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(1900);//0th position
		marksList.add(200);//1st
		marksList.add(3080);//2
		marksList.add(40);//3
		marksList.add(5);//4
		System.out.println(marksList);
		System.out.println(marksList.size());
		//marksList.remove(2);
		
		//marksList.remove(0);
		System.out.println(marksList.get(2));
		
		marksList.add(47);
		System.out.println(marksList.size());
		System.out.println(marksList);
		marksList.add(1, 2500);
		System.out.println(marksList);
		System.out.println(marksList.size());
		
		//marksList.add(10, 4500);//IndexOutOfBoundsException IOBE
		marksList.add(7, 4500);// no error as we are adding at the last position
		
		
		ArrayList<Object> emp = new ArrayList<Object>();
		emp.add("Tom");
		emp.add(30);
		emp.add('m');
		emp.add(12.33);
		emp.add(true);
		
		System.out.println(emp);
		emp.add(0, "naveen");
		System.out.println(emp);
		
		emp.add(6, "google");
		System.out.println(emp);
		emp.add(emp.size(), "Bingo");
		System.out.println(emp);
		
		//Replace or replace
		emp.set(0, "sri");
		System.out.println(emp);
		
		emp.remove(0);
		System.out.println(emp);
		
		
		
		

	}

}
