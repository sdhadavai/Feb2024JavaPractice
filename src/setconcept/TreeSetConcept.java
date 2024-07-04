package setconcept;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		Set<String> browserSet = new TreeSet<String>();// VC=16

		browserSet.add("chorme");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("opera");
		browserSet.add("Chrome90");
		browserSet.add("safari");
		browserSet.add("brave");
		browserSet.add("123");
		//browserSet.add(null);//NPe
		System.out.println(browserSet);

	}

}
