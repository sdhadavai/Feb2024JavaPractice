package dynamicarrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTraverse {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(1900);//0th position
		marksList.add(200);//1st
		marksList.add(3080);//2
		marksList.add(40);//3
		marksList.add(5);//4
		
		System.out.println(marksList);//[100, 200, 300]
		
		for(int i =0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}
		System.out.println("---------");
		
		for(int e : marksList) {
			System.out.println(e);
		}
		
		System.out.println("---------");
		
		for(Integer e : marksList) {
			System.out.println(e);
		}
		System.out.println("---------");
		Collections.sort(marksList);
		System.out.println(marksList);//ASC
		System.out.println("Min marks:" + marksList.get(0));
		System.out.println("Max marks:" + marksList.get(marksList.size()-1));
		
		Collections.sort(marksList, Collections.reverseOrder());
		System.out.println(marksList);//DESC
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("tom");
		empList.add("peter");
		empList.add("naveen");
		empList.add("ravi");
		System.out.println(empList);
		//Collections.sort(empList);
		//System.out.println(empList);
		
		Collections.swap(empList, 0, 1);
		System.out.println(empList);
	}

}
