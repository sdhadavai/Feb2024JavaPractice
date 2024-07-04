package constructorconcept;

import java.util.Arrays;

import javasessions.Page;

public class TestCustomer {

	public static void main(String[] args) {
		
		String[] d = {"Mackbook Pro", "iPhone 14", "keyboard"};
		Customer obj = new Customer("Rahul", 30, d);
		String rahulDev[] = obj.getDevicesInfo();
		System.out.println(Arrays.toString(rahulDev));
		int count = obj.getDevicesCount();
		System.out.println(count);
		
		
		//Browser br = new Browser();//Cannot create object as Browser class has private constructor
		Browser.get();
		Browser.close();
		
		Browser br = new Browser("Chome");// can all as 1 parm is public
		
		Page pg = new Page();
		System.out.println(pg.age);
		System.out.println(Page.name);
		
	}

}
