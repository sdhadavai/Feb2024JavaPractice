package oopsencapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launching the browser");
		checkBrowserVersion();
		checkBrowserOSCompatability();
		checkBrowserUpdates();
		checkBrowserLatestVersion();
		checkRAMSpace();
		System.out.println("Browser is laucnhed");
	}
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	private void checkBrowserOSCompatability() {
		System.out.println("checkBrowserOSCompatability");
	}
	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates");
	}
	private void checkBrowserLatestVersion() {
		System.out.println("checkBrowserLatestVersion");
	}
	
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
	}

}
