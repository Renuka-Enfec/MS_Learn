package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.get("https://enfec.kredily.com/login/?next=/company/dashboard/");
	System.out.println("Opened chrome browser");
	driver.quit();
	System.out.println("closed chrome browser");

	}

}
