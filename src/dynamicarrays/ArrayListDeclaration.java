package dynamicarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclaration {

	public static void main(String[] args) {
		
		List<Integer> marksList = new ArrayList<Integer>();
		marksList.add(1900);//0th position
		marksList.add(200);//1st
		marksList.add(3080);//2

		List<Integer> mList = Arrays.asList(1,2,3,4,5);//creates a immutable arraylist
		System.out.println(mList);
		
		//Immutable
		List<String> browserList = Arrays.asList("Chorme","firefox","safari","opera");//creates a immutable arraylist
		System.out.println(browserList.size());
		//browserList.add("ie");//UnsupportedOperationException
		
		
		//Mutable
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Chorme","firefox","safari","opera"));
		System.out.println(empList.size());
		empList.add("ie");
		System.out.println(empList.size());

	}

}
