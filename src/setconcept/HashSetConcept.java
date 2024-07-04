package setconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// cannot have duplicate value
		//does not maintain the order
		//no index
		
		Set<String> browserSet = new HashSet<String>();//VC=16
		
		browserSet.add("chorme");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("chorme");
		browserSet.add(null);
		System.out.println(browserSet);
		System.out.println(browserSet.contains("chorme"));
		System.out.println(browserSet.contains("opera"));
		System.out.println("------------");
		browserSet.forEach(e -> System.out.println(e));
		
		//traverser
		/*
		 * for(String e : browserSet) { System.out.println(e); }
		 */
		//iterator:
		System.out.println("------------");
		Iterator<String> it = browserSet.iterator();
		/*
		 * String b1 = it.next(); System.out.println(b1); String b2 = it.next();
		 * System.out.println(b2); String b3 = it.next(); System.out.println(b3);
		 */
		
		
		while(it.hasNext()) {
			String br = it.next();
			System.out.println(br);
		}
		System.out.println("------------");
		//Set to List
		List<String> browserList = new ArrayList<String>(browserSet);
		System.out.println(browserList.get(0));
		System.out.println(browserList);
		
	}

}
