package oopabstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10, 20);
		System.out.println("----------------");
		lp.title();
		lp.url();
		Page.displayLogo();
		LoginPage.displayLogo();
		lp.getPageInfo();
		lp.doLogin("Sri", "sri@123");
		System.out.println(lp.timeOut);
		lp.timeOut =20;
		System.out.println(lp.timeOut);
		System.out.println(Page.TIME_OUT);
		System.out.println(LoginPage.TIME_OUT);
		lp.getBillingInfo();
		
		//Page p = new Page();//Cannot create object of abstract class
		System.out.println("------Top Casting----------");
		//Top casting: Child class object can be referred by parent abstract class ref variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.getPageInfo();
		
		//Down casting not possible even at compile time.
		
		
			

	}

}
