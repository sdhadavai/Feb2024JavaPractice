package dynamicarrays;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(12.33);
		ar.add("testing");
		ar.add('a');
		ar.add(true);
		
		//Only Integer type of data in array list
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		//marksList.add("test");//cannot add
		marksList.add(200);
		
		ArrayList<Double> mList = new ArrayList<Double>();
		mList.add(12.33);
		//mList.add(100);//not allowed
		mList.add(100.00);
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("CHROME");
		browserList.add("FIREFOX");
		
		ArrayList<Object> emp = new ArrayList<Object>();
		emp.add("Tom");
		emp.add(30);
		emp.add('m');
		emp.add(12.33);
		emp.add(true);
		System.out.println(emp.size());
		System.out.println(emp.get(0));
		

	}

}
