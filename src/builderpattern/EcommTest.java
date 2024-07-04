package builderpattern;

public class EcommTest {

	public static void main(String[] args) {

		Ecommerce obj = new Ecommerce();
		
		
		obj.login("naveen", "naveen123")
				.search("Apple Mackbook Pro")
					.addToCart("Apple Mackbook Pro")
						.payment("1234 3234 2345 5322", 333)
							.generateOrder()
								.logout();
		
		System.out.println(obj.orderId);
		System.out.println("---------");
		//
		obj.login("Naveen", "naveen123")
			.search("Nike shoes", 5000)
			.logout();
		
		System.out.println("---------");
		//
		
		obj.login("Naveen", "naveen123")
			.search("TV", 1000)
			.search("keyboard")
				.search("Bottle")
					.addToCart("TV")
						.payment("naveen@hdfc")
							.logout();
		
		System.out.println("---------");
		obj.login("ekata", "ekta123")
			.logout();
		
		System.out.println("---------");
		obj.login("ekata", "ekta123");
		
		System.out.println("---------");
		obj.search("Apple Mackbook Pro")
		.addToCart("Apple Mackbook Pro")
		.payment("1234 3234 2345 5322", 333)
			.generateOrder()
				.logout();
			

	}

}
