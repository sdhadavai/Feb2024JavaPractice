package setconcept;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetConcept {

	public static void main(String[] args) {

		Set<String> browserSet = new LinkedHashSet<String>();// VC=16

		browserSet.add("chorme");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("opera");
		browserSet.add("chrome90");
		browserSet.add("safari");
		browserSet.add("brave");
		browserSet.add(null);
		System.out.println(browserSet);
		
		for(String e : browserSet) {
			System.out.println(e);
		}
		System.out.println("-------------");
		List<String> browserList = new ArrayList<String>(browserSet);
		System.out.println(browserList.get(0));
		System.out.println(browserList);

	}

}
