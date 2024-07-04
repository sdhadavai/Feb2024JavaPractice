package dynamicarrays;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> empMap = new HashMap<String, String>();// V=16
		
		//It maintaince the order
		//Map<String, String> empMap = new LinkedHashMap<String, String>();// V=16
		
		//Sorted order
		//Map<String, String> empMap = new TreeMap<String, String>();// V=16

		System.out.println(empMap.size());//0
		empMap.put("peter", "QA");
		empMap.put("Lisa", "SDET");
		empMap.put("Ekta", "Dev");
		empMap.put("Ravi", "Manager");
		empMap.put("Arti", "Fresher");
		empMap.put("aakash", "Fresher");
		empMap.put("1test", "Fresher");
		
		
		
		//K-V KeySet(EntrySet)
		for(Map.Entry<String, String> entry :  empMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("----------");
		//foreach method using lamda
		empMap.forEach((K,v) -> System.out.println(K + ":" + v));
		
		//empMap.put(null, "Trainer");//not allowed in TreeMap: NPE
		System.out.println(empMap.size());//5
		System.out.println(empMap.get("Ekta"));
		System.out.println(empMap.get("Selenium"));//null
		System.out.println(empMap);//null
		
		//use cases for HashMap
		//1. RBAC(user roles): Seller, partner, distribution, vendor, user, admin
		//2. product list <String, Integer>
		//3. Product Meta Data
		//4. Excel Data
		//5. API Testing: Headers in HashMap
		
		
		//other HashMap is Properties which uses Key Value

	}

}
