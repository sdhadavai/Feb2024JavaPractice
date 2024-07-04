package builderpattern;

public class Ecommerce {
	int orderId;
	
	//Builder pattern is having methods which return current class object
	
	public Ecommerce login() {
		System.out.println("User logged in");
		return this;
	}
	
	public Ecommerce login(String userName, String password) {
		System.out.println("User logged in with:" + userName + " " + password);
		return this;
	}
	
	public Ecommerce search() {
		System.out.println("Search with default products");
		return this;
	}
	
	public Ecommerce search(String productName) {
		System.out.println("Search with product " + productName);
		return this;
	}
	
	public Ecommerce search(String productName, int price) {
		System.out.println("Search with product " + productName + " " + price);
		return this;
	}
	
	public Ecommerce addToCart(String productName) {
		System.out.println("add to cart:" + productName);
		return this;
	}
	
	public Ecommerce payment(String upi) {
		System.out.println("make payment vai upi:" + upi);
		return this;
	}
	
	public Ecommerce payment(String cc, int cvv) {
		System.out.println("make payment vai CC:" + cc + " " + cvv);
		return this;
	}
	
	public Ecommerce generateOrder() {
		System.out.println("Your order id is:" +  12345);
		this.orderId = 12345;
		return this;
	}
	
	public Ecommerce logout() {
		System.out.println("User logged out");
		return this;
	}
	
	

}
