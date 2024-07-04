package hashmapconcept;

import java.util.HashMap;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		//Stores the values as Key - Value pair
		HashMap<String, String> studentMap = new HashMap<String, String>();//V=15
		
		studentMap.put("Tom", "A");
		studentMap.put("peter", "B");
		studentMap.put("Lisa", "A++");
		studentMap.put("Ravi", "C");
		
		
		System.out.println(studentMap);
		studentMap.put("Ravi", "C++");
		System.out.println(studentMap);	
		studentMap.put("Aarti", "A");
		System.out.println(studentMap);
		studentMap.put("Ekta", null);
		System.out.println(studentMap);
		
		studentMap.put(null, "Z++");
		System.out.println(studentMap);
		studentMap.put(null, "P++");
		System.out.println(studentMap);
		studentMap.put("Sri", null);
		System.out.println(studentMap);
		
		//Fetching data by key
		System.out.println(studentMap.get("Tom"));
		System.out.println(studentMap.get(null));
		System.out.println(studentMap.size());
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Ekta", 1000);
		empMap.put("Ravi", 3000);
		empMap.put("Saurabh", 4000);
		System.out.println(empMap);
		System.out.println(empMap.get("Ravi"));
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(101, 100);
		mp.put(102, 400);
		mp.put(104, 500);
		mp.put(108, 800);
		mp.put(103, 1600);
		mp.put(null, 900);
		mp.put(1103, null);
		mp.put(1105, null);
		System.out.println(mp);
		mp.put(null, 9090);
		System.out.println(mp);
		
		HashMap<String, Object> mp1 = new HashMap<String, Object>();
		mp1.put("Ravi", "SDET");
		mp1.put("Ekta", 1000);
		
		System.out.println(mp1.get("test"));
		
		HashMap<String, String[]> mp2 = new HashMap<String, String[]>();
		String[] cities = {"Bng", "Pune", "Delhi"};
		mp2.put("India", cities);
		String[] In = mp2.get("India");
		System.out.println(In[0]);
		
		//mp2.put("USA", {"PA","LA"});//Need to check
		
		

	}

}
